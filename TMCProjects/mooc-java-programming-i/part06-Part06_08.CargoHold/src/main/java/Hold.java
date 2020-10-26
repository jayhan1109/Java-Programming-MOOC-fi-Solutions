import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int total = 0;
        if (!suitcases.isEmpty()) {
            for (Suitcase s : suitcases) {
                total += s.totalWeight();
            }
        }

        if (total + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        int total = 0;
        for (Suitcase s : suitcases) {
            total += s.totalWeight();
        }


        return suitcases.size() + " suitcases (" + total + " kg)";
    }

    public void printItems() {
        for (Suitcase s : suitcases) {
            s.printItems();
        }
    }
}
