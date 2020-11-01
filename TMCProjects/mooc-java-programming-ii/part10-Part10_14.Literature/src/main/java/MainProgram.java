
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookStorage storage = new BookStorage();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();

            if(title.equals("")){
                break;
            }

            System.out.print("Input the age recommendtaion: ");
            int age = Integer.parseInt(scanner.nextLine());

            storage.addBook(title, age);
        }

        System.out.println(storage.getNumOfBooks()+" books in total.\n");
        storage.sort();
        System.out.println(storage);
    }

}
