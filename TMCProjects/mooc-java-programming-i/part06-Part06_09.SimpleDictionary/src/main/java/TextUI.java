import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String str = scanner.nextLine();

            if (str.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (str.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                continue;
            }

            if (str.equals("search")) {
                System.out.print("To be translated: ");
                String target = scanner.nextLine();
                String translation = dictionary.translate(target);
                if (translation == null) {
                    System.out.println("Word " + target + " was not found");
                } else {
                    System.out.print("Translation: " + translation);
                }
                continue;
            }

            System.out.println("Unknown command");
        }
    }
}
