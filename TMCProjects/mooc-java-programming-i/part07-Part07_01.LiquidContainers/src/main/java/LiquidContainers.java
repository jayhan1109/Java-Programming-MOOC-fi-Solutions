
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;


        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");

            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] words = input.split(" ");
            String word = words[0];
            int num = Integer.parseInt(words[1]);

            if (num < 0) {
                continue;
            }

            if (word.equals("add")) {
                container1 += num;
                if (container1 > 100) {
                    container1 = 100;
                }
            }

            if (word.equals("move")) {
                if (container1 < num) {
                    container2 += container1;
                    container1 = 0;
                    continue;
                }

                container1 -= num;
                container2 += num;

                if (container2 > 100) {
                    container2 = 100;
                }
            }

            if (word.equals("remove")) {
                container2 -= num;

                if (container2 < 0) {
                    container2 = 0;
                }
            }

        }
    }

}
