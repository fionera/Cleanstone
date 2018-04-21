package rocks.cleanstone.net.packet.minecraft.outbound;

import rocks.cleanstone.net.packet.Packet;
import rocks.cleanstone.net.packet.PacketType;
import rocks.cleanstone.net.packet.minecraft.MinecraftOutboundPacketType;

public class SetCompressionPacket implements Packet {

    /**
     * Maximum size of a packet before it is compressed
     */
    private final int threshold;

    public SetCompressionPacket(int threshold) {
        this.threshold = threshold;
    }

    public int getThreshold() {
        return threshold;
    }

    @Override
    public PacketType getType() {
        return MinecraftOutboundPacketType.SET_COMPRESSION;
    }
}
