package study.org.carbohz.hangman.lib;

public class GameProgressObserver {
    private int attemptLeft;

    public GameProgressObserver(final int totalAttempts) {
        this.attemptLeft = totalAttempts;
    }

    public void decreaseAttempts() {
        --attemptLeft;
    }

    public boolean stillAlive() {
        return attemptLeft > 0;
    }

    public int getAttemptLeft() {
        return attemptLeft;
    }
}
