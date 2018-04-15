package rocks.cleanstone.net.netty;

import java.net.InetAddress;
import java.util.Collections;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import rocks.cleanstone.net.AbstractNetworking;
import rocks.cleanstone.net.Connection;
import rocks.cleanstone.net.netty.pipeline.receive.ByteStreamDecoder;
import rocks.cleanstone.net.netty.pipeline.receive.CompressionDecoder;
import rocks.cleanstone.net.netty.pipeline.receive.IdentificationHandler;
import rocks.cleanstone.net.netty.pipeline.receive.InsulatedPacketDecoder;
import rocks.cleanstone.net.netty.pipeline.receive.PacketDataDecoder;
import rocks.cleanstone.net.netty.pipeline.receive.PacketHandler;
import rocks.cleanstone.net.packet.PacketTypeRegistry;
import rocks.cleanstone.net.packet.SendPacket;
import rocks.cleanstone.net.packet.protocol.Protocol;

public class NettyNetworking extends AbstractNetworking {

    private final boolean epoll = true;
    private final int socketBacklog = 128;
    private final boolean socketKeepAlive = true;

    public NettyNetworking(int port, InetAddress address, PacketTypeRegistry packetTypeRegistry, Protocol protocol) {
        super(port, address, packetTypeRegistry, protocol);
    }

    @Override
    public void start() {
        EventLoopGroup bossGroup = epoll ? new EpollEventLoopGroup() : new NioEventLoopGroup();
        EventLoopGroup workerGroup = epoll ? new EpollEventLoopGroup() : new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)
                    .channel(epoll ? EpollServerSocketChannel.class : NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        public void initChannel(SocketChannel ch) {
                            ch.pipeline().addLast(
                                    new IdentificationHandler(Collections.emptySet()),
                                    new ByteStreamDecoder(),
                                    new CompressionDecoder(),
                                    new PacketDataDecoder(),
                                    new InsulatedPacketDecoder(protocol),
                                    new PacketHandler(NettyNetworking.this));
                        }
                    })
                    .option(ChannelOption.SO_BACKLOG, socketBacklog)
                    .childOption(ChannelOption.SO_KEEPALIVE, socketKeepAlive);

            ChannelFuture f = null;
            try {
                f = b.bind(port).sync();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

    @Override
    public void sendPacket(Connection connection, SendPacket packet) {
    }
}