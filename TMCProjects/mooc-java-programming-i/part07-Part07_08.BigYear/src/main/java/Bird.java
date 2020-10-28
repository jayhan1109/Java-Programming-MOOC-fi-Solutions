public class Bird {
    private String engName;
    private String latinName;
    private int observation;

    public Bird(String engName, String latinName) {
        this.engName = engName;
        this.latinName = latinName;
        this.observation = 0;
    }

    public String getEngName() {
        return engName;
    }

    public String getLatinName() {
        return latinName;
    }

    public void addObservation() {
        observation++;
    }

    @Override
    public String toString() {
        return engName + " (" + latinName + "): " + observation + " observations";
    }
}
