
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        DB birdDB = new DB();

        while (true) {
            System.out.print("? ");
            String choice = scan.nextLine();

            if (choice.equals("Quit")) {
                break;
            }

            if (choice.equals("Add")) {
                System.out.print("Name: ");
                String engName = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                birdDB.addBird(engName, latinName);
            }

            if (choice.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                birdDB.addObservation(birdName);
            }

            if (choice.equals("All")) {
                for (Bird b : birdDB.findAll()) {
                    System.out.println(b);
                }
            }

            if (choice.equals("One")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                Bird b = birdDB.findOne(birdName);
                System.out.println(b);
            }
        }
    }

}
