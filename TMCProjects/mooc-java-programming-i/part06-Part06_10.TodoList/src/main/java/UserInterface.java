import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        String input;

        while (true) {
            System.out.print("Command: ");
            input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }

            if (input.equals("add")) {
                System.out.print("To add: ");
                input = scanner.nextLine();
                todoList.add(input);
                continue;
            }

            if (input.equals("list")) {
                todoList.print();
                continue;
            }

            if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                input = scanner.nextLine();
                todoList.remove(Integer.parseInt(input));
            }
        }
    }
}
