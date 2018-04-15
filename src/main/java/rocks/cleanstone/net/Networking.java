package rocks.cleanstone.net;

import java.net.InetAddress;

import rocks.cleanstone.net.packet.PacketType;
import rocks.cleanstone.net.packet.SendPacket;
import rocks.cleanstone.net.packet.protocol.Protocol;

public interface Networking {

    int getPort();

    InetAddress getAddress();

    Protocol getProtocol();

    void start();

    void sendPacket(Connection connection, SendPacket packet);

    void registerPacketListener(PacketListener packetListener, PacketType... packetTypes);
}