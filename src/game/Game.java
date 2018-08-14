package game;

public class Game {
    private int[] itsThrows = new int[21];
    private int itsCurrentThrow = 0;
    private int itsCurrentFrame = 1;
    private boolean firstThrow = true;

    public Game() {

    }

    public int score() {
        return scoreForFrame(getCurrentFrame() - 1);
    }

    public void add(int pins) {
        itsThrows[itsCurrentThrow++] = pins;
        adjustCurrentFrame(pins);
    }

    private void adjustCurrentFrame(int pins) {
        if (firstThrow) {
            if (pins == 10)
                itsCurrentFrame++;
            else
                firstThrow = false;
        } else {
            firstThrow = true;
            itsCurrentFrame++;
        }
    }

    public int scoreForFrame(int theFrame) {
        int score = 0;
        int ball = 0;
        for (int currentFrame = 0; currentFrame < theFrame; currentFrame++) {
            int firstThrow = itsThrows[ball++];
            if (firstThrow == 10) {
                score += 10 + itsThrows[ball] + itsThrows[ball + 1];
            } else {

                int secondThrow = itsThrows[ball++];
                int frameScore = firstThrow + secondThrow;
                if (frameScore == 10)
                    score += frameScore + itsThrows[ball];
                else
                    score += frameScore;
            }
        }
        return score;
    }

    public int getCurrentFrame() {
        return itsCurrentFrame;
    }

}
