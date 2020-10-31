import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private final Map<String, Integer> product;
    private final Map<String, Integer> price;

    public Warehouse() {
        product = new HashMap<>();
        price = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.product.put(product, stock);
        this.price.put(product, price);
    }

    public int price(String product) {
        if (!this.price.containsKey(product)) {
            return -99;
        }

        return this.price.get(product);
    }

    public int stock(String product) {
        if (!this.product.containsKey(product)) {
            return 0;
        }

        return this.product.get(product);
    }

    public boolean take(String product) {
        if (!this.product.containsKey(product)) {
            return false;
        }

        int stock = this.product.get(product);

        if (stock <= 0) {
            return false;
        }

        this.product.replace(product, --stock);
        return true;
    }

    public Set<String> products() {
        return product.keySet();
    }
}
