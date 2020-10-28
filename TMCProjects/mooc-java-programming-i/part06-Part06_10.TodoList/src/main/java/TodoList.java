import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todos;

    public TodoList() {
        todos = new ArrayList<>();
    }

    public void add(String task) {
        todos.add(task);
    }

    public void print() {
        int index = 1;
        for (String todo : todos) {
            System.out.println(index + ": " + todo);
            index++;
        }
    }

    public void remove(int number) {
        if (todos.size() >= number) {
            todos.remove(number-1);
        }
    }
}
