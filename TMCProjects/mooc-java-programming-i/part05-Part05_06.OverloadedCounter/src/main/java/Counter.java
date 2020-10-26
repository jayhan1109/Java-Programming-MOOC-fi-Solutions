public class Counter {
    private int counter;

    public Counter() {
        this(0);
    }

    public Counter(int startValue) {
        this.counter = startValue;
    }

    public int value() {
        return this.counter;
    }

    public void increase() {
        this.counter++;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.counter += increaseBy;
        }
    }

    public void decrease() {
        this.counter--;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.counter -= decreaseBy;
        }
    }
}
