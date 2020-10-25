
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int v1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int v2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number:");
        int v3 = Integer.parseInt(scanner.nextLine());
        double avg = ((double) v1 + v2 + v3) / 3;
        System.out.println("The average is " + avg);
    }
}
