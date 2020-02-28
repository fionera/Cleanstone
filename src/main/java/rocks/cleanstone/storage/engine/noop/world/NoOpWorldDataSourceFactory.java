package rocks.cleanstone.storage.engine.noop.world;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import rocks.cleanstone.storage.world.WorldDataSource;
import rocks.cleanstone.storage.world.WorldDataSourceFactory;

@Slf4j
@Component
public class NoOpWorldDataSourceFactory implements WorldDataSourceFactory {

    @Override
    public String getName() {
        return "noop";
    }

    @Override
    public WorldDataSource get(String worldID) {
        return new NoOpWorldDataSource();
    }
}
