package rocks.cleanstone.endpoint.minecraft.vanilla.net.packet.outbound;

import rocks.cleanstone.endpoint.minecraft.vanilla.net.packet.MinecraftOutboundPacketType;
import rocks.cleanstone.endpoint.minecraft.vanilla.net.packet.data.BlockRecord;
import rocks.cleanstone.net.packet.Packet;
import rocks.cleanstone.net.packet.PacketType;

import java.util.Collection;

public class ExplosionPacket implements Packet {

    private final float x;
    private final float y;
    private final float z;
    private final float radius;
    private final Collection<BlockRecord> blockRecords;
    private final float playerMotionX;
    private final float playerMotionY;
    private final float playerMotionZ;

    public ExplosionPacket(float x, float y, float z, float radius, Collection<BlockRecord> blockRecords, float playerMotionX, float playerMotionY, float playerMotionZ) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
        this.blockRecords = blockRecords;
        this.playerMotionX = playerMotionX;
        this.playerMotionY = playerMotionY;
        this.playerMotionZ = playerMotionZ;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public float getRadius() {
        return radius;
    }

    public Collection<BlockRecord> getBlockRecords() {
        return blockRecords;
    }

    public float getPlayerMotionX() {
        return playerMotionX;
    }

    public float getPlayerMotionY() {
        return playerMotionY;
    }

    public float getPlayerMotionZ() {
        return playerMotionZ;
    }

    @Override
    public PacketType getType() {
        return MinecraftOutboundPacketType.EXPLOSION;
    }
}
