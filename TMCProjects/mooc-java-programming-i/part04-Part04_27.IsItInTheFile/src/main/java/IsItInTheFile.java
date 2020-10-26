
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> lists = new ArrayList<>();

        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                lists.add(sc.nextLine());
            }

            for (String s : lists) {
                if (s.equals(searchedFor)) {
                    System.out.println("Found!");
                    return;
                }
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        System.out.println("Not found.");
    }
}
