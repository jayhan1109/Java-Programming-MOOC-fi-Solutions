import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        organisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable m : organisms) {
            m.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String res = "";

        for (Movable m : organisms) {
            res += m.toString() + "\n";
        }

        return res;
    }
}
