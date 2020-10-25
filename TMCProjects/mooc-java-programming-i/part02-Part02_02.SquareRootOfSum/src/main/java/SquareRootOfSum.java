
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Integer.parseInt(scanner.nextLine());
        double num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(Math.sqrt(num1 + num2));
    }
}
