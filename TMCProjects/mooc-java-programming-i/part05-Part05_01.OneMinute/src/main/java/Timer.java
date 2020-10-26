public class Timer {
    private ClockHand seconds;
    private ClockHand hundredOfSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredOfSeconds = new ClockHand(100);
    }

    public void advance() {
        this.hundredOfSeconds.advance();

        if (this.hundredOfSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return this.seconds + ":" + this.hundredOfSeconds;
    }
}
