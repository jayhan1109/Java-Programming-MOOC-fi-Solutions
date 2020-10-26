import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int total = 0;

        if (!items.isEmpty()) {
            for (Item i : items) {
                total += i.getWeight();
            }
        }

        if (total + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }

        int total = 0;
        for (Item i : items) {
            total += i.getWeight();
        }

        if (items.size() == 1) {
            return items.size() + " item (" + total + " kg)";
        }

        return items.size() + " items (" + total + " kg)";
    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Item i : items) {
            total += i.getWeight();
        }

        return total;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item item = items.get(0);

        for (Item i : items) {
            if (item.getWeight() < i.getWeight()) {
                item = i;
            }
        }

        return item;
    }
}
