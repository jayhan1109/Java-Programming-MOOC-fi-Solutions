
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }

        String str = "";

        if (elements.size() == 1) {
            str = "The collection " + name + " has " + elements.size() + " element:";
        } else {
            str = "The collection " + name + " has " + elements.size() + " elements:";
        }


        for (String s : elements) {
            str += "\n" + s;
        }
        return str;
    }
}
