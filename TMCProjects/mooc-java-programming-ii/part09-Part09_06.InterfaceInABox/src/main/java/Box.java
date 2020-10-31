import java.util.ArrayList;

public class Box implements Packable {

    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public void add(Packable packable) {
        double totalWeight = 0.0;
        for (Packable p : items) {
            totalWeight += p.weight();
        }

        if (totalWeight + packable.weight() <= capacity) {
            items.add(packable);
        }
    }

    @Override
    public double weight() {
        double totalWeight = 0.0;
        for (Packable p : items) {
            totalWeight += p.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
