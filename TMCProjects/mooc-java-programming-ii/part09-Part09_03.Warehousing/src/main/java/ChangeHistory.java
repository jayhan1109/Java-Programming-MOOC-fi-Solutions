import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }

        double max = Double.MIN_VALUE;

        for (Double d : history) {
            if (d > max) {
                max = d;
            }
        }

        return max;
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }

        double min = Double.MAX_VALUE;

        for (Double d : history) {
            if (d < min) {
                min = d;
            }
        }

        return min;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Double d : history) {
            total += d;
        }

        return total / history.size();
    }
}
