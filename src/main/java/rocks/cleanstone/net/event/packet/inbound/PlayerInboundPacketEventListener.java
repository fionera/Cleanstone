package rocks.cleanstone.net.event.packet.inbound;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rocks.cleanstone.net.event.PlayerInboundPacketEvent;
import rocks.cleanstone.net.packet.Packet;

public abstract class PlayerInboundPacketEventListener<T extends Packet> {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public abstract void onPacket(PlayerInboundPacketEvent<T> playerInboundPacketEvent);
}
