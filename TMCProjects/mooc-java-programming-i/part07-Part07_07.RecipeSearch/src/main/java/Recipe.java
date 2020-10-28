import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe() {
        this.name = "";
        time = 0;
        this.ingredients = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void addIngredient(String str) {
        if (name.equals("")) {
            this.name = str;
            return;
        }

        if (time == 0) {
            this.time = Integer.parseInt(str);
            return;
        }

        ingredients.add(str);
    }

    @Override
    public String toString() {
        return name+", cooking time: "+time;
    }
}
