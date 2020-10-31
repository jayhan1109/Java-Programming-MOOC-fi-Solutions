import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        items = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        int total = 0;

        for (Item i : items) {
            total += i.getWeight();
        }

        if (item.getWeight() + total <= capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }


}
