
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container c1 = new Container();
        Container c2 = new Container();


        while (true) {
            System.out.println("First: " + c1);
            System.out.println("Second: " + c2);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputs = input.split(" ");
            String command = inputs[0];
            int num = Integer.parseInt(inputs[1]);

            if (command.equals("add")) {
                c1.add(num);
            }

            if (command.equals("move")) {
                if (c1.contains() < num) {
                    c2.add(c1.contains());
                    c1.remove(num);
                }

                if (c1.contains() >= num) {
                    c1.remove(num);
                    c2.add(num);
                }

            }

            if (command.equals("remove")) {
                c2.remove(num);
            }

            System.out.println();
        }
    }

}
