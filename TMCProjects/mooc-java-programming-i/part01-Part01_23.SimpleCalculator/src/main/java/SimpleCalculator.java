
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int v1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int v2 = Integer.parseInt(scanner.nextLine());

        System.out.println(v1 + " + " + v2 + " = " + (v1 + v2));
        System.out.println(v1 + " - " + v2 + " = " + (v1 - v2));
        System.out.println(v1 + " * " + v2 + " = " + (v1 * v2));
        System.out.println(v1 + " / " + v2 + " = " + ((double) v1 / v2));
    }
}
