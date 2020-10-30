import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> money;

    public IOU() {
        money = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        money.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return money.getOrDefault(toWhom, 0.0);
    }
}
