
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        System.out.println("Team: ");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                String[] lists = str.split(",");

                if (team.equals(lists[0])) {
                    games++;
                    if (Integer.parseInt(lists[2]) > Integer.parseInt(lists[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

                if (team.equals(lists[1])) {
                    games++;
                    if (Integer.parseInt(lists[2]) < Integer.parseInt(lists[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }

            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
