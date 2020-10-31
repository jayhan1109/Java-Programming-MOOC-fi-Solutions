import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void add(String product, int price) {
        for (Item i : cart) {
            if (i.getProductName().equals(product)) {
                i.increaseQuantity();
                return;
            }
        }

        cart.add(new Item(product, 1, price));
    }

    public int price() {
        int total = 0;
        for (Item i : cart) {
            total += i.price();
        }
        return total;
    }

    public void print() {
        for (Item i : cart) {
            System.out.println(i);
        }
    }
}
