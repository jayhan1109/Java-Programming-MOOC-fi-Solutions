public class Literacy {
    private String gender;
    private String title;
    private int year;
    private double rate;

    public Literacy(String gender, String title, int year, double rate) {
        this.gender = gender;
        this.title = title;
        this.year = year;
        this.rate = rate;
    }

    public String getGender() {
        return gender;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getRate() {
        return rate;
    }
}
