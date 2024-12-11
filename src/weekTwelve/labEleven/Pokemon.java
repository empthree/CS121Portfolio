package weekTwelve.labEleven;

import java.util.ArrayList;

public class Pokemon {

    // fields
    private String name;
    private int hp;
    private ArrayList<Move> moveArrayList = new ArrayList<>();

    // constructor : parameterized
    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // getter methods (behaviors)
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public ArrayList<Move> getMoveArrayList() {

        return moveArrayList;
    }

    public void addMove(Move move) {

        moveArrayList.add(move);
    }

    public void removeMove(Move move) {
        moveArrayList.remove(move);
    }

    public ArrayList<Move> getAllMoves() {
        return moveArrayList;
    }

    public Move getMove(String moveName) {
        Move foundMove = null;
        for (Move move : moveArrayList) {
            if (move.getMoveName().equals(moveName)) {
                foundMove = move;
                break;
            }
        }
        return foundMove;
    }

    // OOP : polymorphism : run-time / override polymorphism
    @Override
    public String toString() {
        return String.format("Name: %s\n" +
                        "HP: %d\n",
                name, hp);
    }
}
