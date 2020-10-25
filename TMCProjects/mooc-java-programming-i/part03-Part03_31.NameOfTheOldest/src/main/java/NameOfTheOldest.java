
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";

        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }

            String[] list = str.split(",");
            if (oldest < Integer.parseInt(list[1])) {
                oldest = Integer.parseInt(list[1]);
                name = list[0];
            }
        }

        System.out.println("Name of the oldest: " + name);
    }
}
