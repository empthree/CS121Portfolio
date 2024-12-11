package weekTwelve.labEleven;

public class Move {

    // fields
    private String moveName;
    private int movePower;
    private int moveSpeed;

    // constructor
    public Move(String moveName, int movePower, int moveSpeed) {
        this.moveName = moveName;
        this.movePower = movePower;
        this.moveSpeed = moveSpeed;
    }

    public String getMoveName() {
        return moveName;
    }

    public int getMovePower() {
        return movePower;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    @Override
    public String toString() {
        return String.format("Move: %s\n" +
                        "Power: %d\n" +
                        "Speed: %d\n",
                moveName, movePower, moveSpeed);
    }
}

