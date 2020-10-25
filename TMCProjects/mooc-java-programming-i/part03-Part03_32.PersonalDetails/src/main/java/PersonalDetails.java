
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        String longest = "";
        int count = 0;

        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }

            String[] list = str.split(",");
            if (longest.length() < list[0].length()) {
                longest = list[0];
            }
            count++;
            total += Integer.parseInt(list[1]);
        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + ((double) total / count));
    }
}
