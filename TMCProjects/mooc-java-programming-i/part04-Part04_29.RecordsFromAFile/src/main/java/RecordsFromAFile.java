import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                String[] list = str.split(",");
                System.out.println(list[0] + ", age: " + list[1] + " years");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
