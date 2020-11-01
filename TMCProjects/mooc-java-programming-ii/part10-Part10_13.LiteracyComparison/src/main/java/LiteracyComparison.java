import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {

    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 6)
                    .map(line -> new Literacy(line[2].trim().split(" ")[0], line[3], Integer.parseInt(line[4]), Double.parseDouble(line[5])))
                    .sorted((l1, l2) -> l1.getRate() >= l2.getRate() ? 1 : -1)
                    .forEach(li -> System.out.println(li.getTitle() + " (" + li.getYear() + "), " + li.getGender() + ", " + li.getRate()));
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
