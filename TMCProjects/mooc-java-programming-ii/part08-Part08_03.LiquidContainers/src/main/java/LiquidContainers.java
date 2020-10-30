
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int c1 = 0;
        int c2 = 0;

        while (true) {
            System.out.println("First: " + c1 + "/100");
            System.out.println("Second: " + c2 + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] res = input.split(" ");
            String command = res[0];
            int num = Integer.parseInt(res[1]);

            if (command.equals("add")) {
                if (num > 0) {
                    c1 += num;
                }

                if (c1 > 100) {
                    c1 = 100;
                }
            }

            if (command.equals("move")) {
                if (num > c1) {
                    c2 += c1;
                    c1 = 0;
                }

                if (num <= c1 && num > 0) {
                    c2 += num;
                    c1 -= num;
                }

                if (c2 > 100) {
                    c2 = 100;
                }
            }

            if (command.equals("remove")) {
                if (num > c2) {
                    c2 = 0;
                }

                if (num > 0 && num <= c2) {
                    c2 -= num;
                }

                if(c2<0){
                    c2 = 0;
                }
            }
            System.out.println();
        }
    }

}
