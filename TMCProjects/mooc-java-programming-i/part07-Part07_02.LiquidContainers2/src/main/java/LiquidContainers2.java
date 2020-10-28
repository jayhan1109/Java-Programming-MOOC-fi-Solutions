
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

            String[] words = input.split(" ");
            String word = words[0];
            int num = Integer.parseInt(words[1]);

            if (num < 0) {
                continue;
            }

            if (word.equals("add")) {
                c1.add(num);
            }

            if (word.equals("move")) {
                if (num <= c1.contains()) {
                    c2.add(num);
                    c1.remove(num);
                }else{
                    c2.add(c1.contains());
                    c1.remove(num);
                }

            }

            if (word.equals("remove")) {
                c2.remove(num);
            }

        }
    }

}
