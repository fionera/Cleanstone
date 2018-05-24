package rocks.cleanstone.player.listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import rocks.cleanstone.game.Position;
import rocks.cleanstone.game.entity.PlayerMoveEvent;
import rocks.cleanstone.game.world.generation.FlatWorldGenerator;
import rocks.cleanstone.game.world.region.chunk.vanilla.ChunkDataPacketFactory;
import rocks.cleanstone.net.minecraft.packet.outbound.ChunkDataPacket;
import rocks.cleanstone.net.minecraft.packet.outbound.UnloadChunkPacket;
import rocks.cleanstone.player.Player;
import rocks.cleanstone.player.event.PlayerQuitEvent;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PlayerMoveChunkLoadListener {
    private final Map<String, Map<Integer, Set<Integer>>> playerHasLoaded = new HashMap<>();

    private final FlatWorldGenerator flatWorldGenerator = new FlatWorldGenerator(); //TODO: Get correct Generator

    @EventListener
    @Async("playerExec")
    public void onPlayerMove(PlayerMoveEvent playerMoveEvent) {
        final int chunkX = ((int) playerMoveEvent.getNewPosition().getX()) >> 4;
        final int chunkZ = ((int) playerMoveEvent.getNewPosition().getZ()) >> 4;
        final Player player = playerMoveEvent.getPlayer();
        String uuid = player.getId().getUUID().toString();

        if (isSameChunk(playerMoveEvent.getOldPosition(), playerMoveEvent.getNewPosition()) && hasPlayerLoaded(uuid, chunkX, chunkZ)) {
            return;
        }

        for (int i = -8; i < 8; i++) {
            for (int j = -8; j < 8; j++) {
                final int currentX = chunkX + i;
                final int currentZ = chunkZ + j;

                if (i < -4 || i > 4 || j < -4 || j > 4) { //TODO: Some weird flapping happens here
                    if (hasPlayerLoaded(uuid, currentX, currentZ)) {
                        playerUnload(uuid, currentX, currentZ);

                        sendChunkUnload(player, currentX, currentZ);
                    }

                    continue;
                }

                if (!hasPlayerLoaded(uuid, currentX, currentZ)) {
                    playerLoad(uuid, currentX, currentZ);

                    sendChunkLoad(player, currentX, currentZ);
                }
            }
        }
    }

    @Async("playerExec")
    protected void sendChunkUnload(Player player, int x, int z) {
        UnloadChunkPacket unloadChunkPacket = new UnloadChunkPacket(x, z);
        player.sendPacket(unloadChunkPacket);
    }

    @Async("playerExec")
    protected void sendChunkLoad(Player player, int x, int z) {
        ChunkDataPacket chunkDataPacket = ChunkDataPacketFactory.create(flatWorldGenerator.generateChunk(x, z), true);
        player.sendPacket(chunkDataPacket);
    }

    @EventListener
    @Async("playerExec")
    public void onPlayerDisconnect(PlayerQuitEvent playerQuitEvent) {
        playerUnloadAll(playerQuitEvent.getPlayer().getId().getUUID().toString());
    }

    private boolean isSameChunk(Position oldPosition, Position newPosition) {
        final int oldChunkX = ((int) oldPosition.getX()) >> 4;
        final int oldChunkZ = ((int) oldPosition.getZ()) >> 4;

        final int newChunkX = ((int) newPosition.getX()) >> 4;
        final int newChunkZ = ((int) newPosition.getZ()) >> 4;

        return oldChunkX == newChunkX && oldChunkZ == newChunkZ;
    }

    private void playerLoad(String uuid, int x, int z) {
        checkMap(uuid, x, z);

        playerHasLoaded.get(uuid).get(x).add(z);
    }

    private void playerUnload(String uuid, int x, int z) {
        checkMap(uuid, x, z);

        playerHasLoaded.get(uuid).get(x).remove(z);
    }

    private boolean hasPlayerLoaded(String uuid, int x, int z) {
        checkMap(uuid, x, z);

        return playerHasLoaded.get(uuid).get(x).contains(z);
    }

    private void playerUnloadAll(String uuid) {
        playerHasLoaded.remove(uuid);
    }

    private void checkMap(String uuid, int x, int z) {
        playerHasLoaded.putIfAbsent(uuid, new HashMap<>());
        playerHasLoaded.get(uuid).putIfAbsent(x, new HashSet<>());
    }
}