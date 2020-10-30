import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todos;

    public TodoList() {
        todos = new ArrayList<>();
    }

    public void add(String todo) {
        todos.add(todo);
    }

    public void remove(int num) {
        if (todos.size() >= num) {
            todos.remove(num - 1);
        }
    }

    public void print() {
        for (int i = 0; i < todos.size(); i++) {
            System.out.println((i + 1) + ": " + todos.get(i));
        }
    }
}
