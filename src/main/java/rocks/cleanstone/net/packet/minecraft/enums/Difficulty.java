package rocks.cleanstone.net.packet.minecraft.enums;

public enum Difficulty {
    PEACEFUL(0),
    EASY(1),
    HARD(2);

    private final int difficultyID;

    Difficulty(int difficultyID) {
        this.difficultyID = difficultyID;
    }

    public int getDifficultyID() {
        return difficultyID;
    }

    @SuppressWarnings("Duplicates")
    public static Difficulty fromDifficultID(int difficultyID) {
        for (Difficulty difficulty : Difficulty.values()) {
            if (difficulty.getDifficultyID() == difficultyID) {
                return difficulty;
            }
        }

        return null;
    }
}
