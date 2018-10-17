package rocks.cleanstone.net.minecraft.listener.inbound;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import rocks.cleanstone.net.event.PlayerInboundPacketEvent;
import rocks.cleanstone.net.minecraft.packet.inbound.CreativeInventoryActionPacket;

@Component
public class CreativeInventoryActionListener {

    @Async(value = "playerExec")
    @EventListener
    public void onPacket(PlayerInboundPacketEvent<CreativeInventoryActionPacket> playerInboundPacketEvent) {
        CreativeInventoryActionPacket packet = playerInboundPacketEvent.getPacket();

        playerInboundPacketEvent.getPlayer().getEntity().getInventory().setItemInSlot(packet.getSlot(), packet.getClickedItem());
    }
}
