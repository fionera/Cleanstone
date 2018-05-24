package rocks.cleanstone.player.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import rocks.cleanstone.game.Position;
import rocks.cleanstone.game.entity.EntityMoveEvent;
import rocks.cleanstone.game.entity.vanilla.Human;
import rocks.cleanstone.net.minecraft.packet.outbound.EntityLookAndRelativeMovePacket;
import rocks.cleanstone.player.Player;
import rocks.cleanstone.player.PlayerManager;

public class PlayerMoveListener {
    private final PlayerManager playerManager;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public PlayerMoveListener(PlayerManager playerManager) {
        this.playerManager = playerManager;
    }

    @EventListener
    public void onPlayerMove(EntityMoveEvent entityMoveEvent) {
        if (!(entityMoveEvent.getEntity() instanceof Human)) {
            return;
        }

        Position oldPosition = entityMoveEvent.getOldPosition();
        Position newPosition = entityMoveEvent.getNewPosition();

        Player joinedPlayer = playerManager.getOnlinePlayers().stream().filter(player -> player.getEntity().getEntityID() == entityMoveEvent.getEntity().getEntityID()).findFirst().get();
        final int entityID = entityMoveEvent.getEntity().getEntityID();

        final double deltaX = (((newPosition.getX()) * 32 - (oldPosition.getX()) * 32) * 128);
        final double deltaY = (((newPosition.getY()) * 32 - (oldPosition.getY()) * 32) * 128);
        final double deltaZ = (((newPosition.getZ()) * 32 - (oldPosition.getZ()) * 32) * 128);

        final float pitch = entityMoveEvent.getNewRotation().getPitch();
        final float yaw = entityMoveEvent.getNewRotation().getYaw();

        boolean teleport = deltaX > Short.MAX_VALUE || deltaY > Short.MAX_VALUE || deltaZ > Short.MAX_VALUE
                || deltaX < Short.MIN_VALUE || deltaY < Short.MIN_VALUE || deltaZ < Short.MIN_VALUE;

        if (teleport) {
            //TODO: Send Teleport if more than 8 Blocks
        } else {
            EntityLookAndRelativeMovePacket entityLookAndRelativeMovePacket = new EntityLookAndRelativeMovePacket(entityID, ((short) deltaX), ((short) deltaY), ((short) deltaZ), yaw, pitch, true); //TODO: Add onGround

            playerManager.broadcastPacket(entityLookAndRelativeMovePacket, joinedPlayer);
        }
    }
}