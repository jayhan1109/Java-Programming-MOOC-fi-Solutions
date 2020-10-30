import java.util.HashMap;

public class Abbreviations {

    HashMap<String, String> abs;

    public Abbreviations() {
        abs = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (!hasAbbreviation(abbreviation)) {
            abs.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abs.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return abs.get(abbreviation);
    }

}
