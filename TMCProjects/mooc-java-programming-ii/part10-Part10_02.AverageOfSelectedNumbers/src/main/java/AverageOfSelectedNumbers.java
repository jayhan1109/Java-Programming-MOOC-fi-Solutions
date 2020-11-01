import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> nums = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            nums.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();

        if (choice.equals("n")) {
            System.out.print("Average of the negative numbers: ");
            System.out.print(nums.stream().mapToInt(s -> Integer.parseInt(s)).filter(s -> s < 0).average().getAsDouble());
        } else {
            System.out.print("Average of the positive numbers: ");
            System.out.print(nums.stream().mapToInt(s -> Integer.parseInt(s)).filter(s -> s > 0).average().getAsDouble());
        }
    }
}
