import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }

            if (input.equals("add")) {
                System.out.print("To add: ");
                String todo = scanner.nextLine();
                todoList.add(todo);
            }

            if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                int idx = Integer.parseInt(scanner.nextLine());
                todoList.remove(idx);
            }

            if (input.equals("list")) {
                todoList.print();
            }
        }
    }
}
