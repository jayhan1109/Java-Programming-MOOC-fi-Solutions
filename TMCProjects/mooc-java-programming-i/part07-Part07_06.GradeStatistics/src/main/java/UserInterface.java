import java.util.Scanner;

public class UserInterface {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        Statistics st = new Statistics();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num == -1) {
                break;
            }

            st.addPoint(num);
        }

        System.out.println("Point average (all): " + st.getAvg());
        System.out.println("Point average (passing): " + (st.getPassingAvg() == 0.0 ? "-" : st.getPassingAvg()));
        System.out.println("Pass percentage: " + st.getPassPercentage());
        System.out.println("Grade distribution:");
        st.printGrades();
    }
}
