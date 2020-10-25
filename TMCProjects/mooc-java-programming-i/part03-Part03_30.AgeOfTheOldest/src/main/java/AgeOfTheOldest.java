
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }

            String[] list = str.split(",");

            if (oldest < Integer.parseInt(list[1])) {
                oldest = Integer.parseInt(list[1]);
            }
        }

        System.out.println("Age of the oldest: " + oldest);
    }
}
