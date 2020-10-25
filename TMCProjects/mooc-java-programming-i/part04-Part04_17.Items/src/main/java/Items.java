
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Name: ");
            String str = scanner.nextLine();

            if(str.isEmpty()){
                break;
            }

            items.add(new Item(str));
        }

        for(Item i:items){
            System.out.println(i);
        }
    }
}
