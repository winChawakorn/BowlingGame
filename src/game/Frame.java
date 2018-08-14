package game;

public class Frame {
    private int itsScore = 0;

    public Frame() {
    }

    public int getItsScore() {
        return itsScore;
    }

    public void add(int pins) {
        itsScore += pins;
    }
}
