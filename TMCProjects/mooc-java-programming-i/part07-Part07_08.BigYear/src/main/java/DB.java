import java.util.ArrayList;

public class DB {
    private ArrayList<Bird> birds;

    public DB() {
        birds = new ArrayList<>();
    }

    public void addBird(String engName, String latinName) {
        Bird b = findOne(engName);
        if (b == null) {
            birds.add(new Bird(engName, latinName));
        }
    }

    public Bird findOne(String name) {
        for (Bird b : birds) {
            if (name.equals(b.getEngName())) {
                return b;
            }
        }

        return null;
    }

    public ArrayList<Bird> findAll() {
        return this.birds;
    }

    public void addObservation(String name) {
        Bird b = findOne(name);
        if (b != null) {
            b.addObservation();
        }else{
            System.out.println("Not a bird!");
        }
    }
}
