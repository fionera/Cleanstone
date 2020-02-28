package rocks.cleanstone.core.config.structs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Section of the main configuration file with various game-related properties
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "game")
public class GameConfig {
    private boolean onlineMode;
    private String motd;
    private int maxPlayers, maxViewDistance;
    private List<String> ops;
    private List<WorldConfig> worlds;
}

