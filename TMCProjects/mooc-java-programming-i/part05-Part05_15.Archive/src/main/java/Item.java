

public class Item {
    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Item)) {
            return false;
        }

        Item i = (Item) o;

        if (this.id.equals(i.id)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
