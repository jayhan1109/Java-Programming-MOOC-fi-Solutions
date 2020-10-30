
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                nums.add(num);
            }
        }

        if (nums.size() == 0) {
            System.out.println("Cannot calculate the average");
            return;
        }

        int total = 0;

        for (int i : nums) {
            total += i;
        }

        System.out.println((double) total / nums.size());

    }
}
