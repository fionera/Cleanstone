package rocks.cleanstone.game.world.generation;

public enum WorldGenerationParameter {
    FREQUENCY,
    FRACTAL_OCTAVES,
    AMPLITUDE,
    HEIGHT,
    POWER;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
