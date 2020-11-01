
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 0) {
                break;
            }

            list.add(num);
        }

        list.stream().filter(n -> n >= 1 && n <= 5).forEach(System.out::println);

    }
}
