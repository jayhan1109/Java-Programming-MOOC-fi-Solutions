import java.util.ArrayList;
import java.util.Comparator;

public class BookStorage {
    private ArrayList<Book> storage;

    public BookStorage() {
        storage = new ArrayList<>();
    }

    public void addBook(String title, int age) {
        storage.add(new Book(title, age));
    }

    public int getNumOfBooks() {
        return this.storage.size();
    }

    public void sort() {
        Comparator<Book> comparator = Comparator.comparing(Book::getAge).thenComparing(Book::getTitle);
        storage.sort(comparator);
    }

    @Override
    public String toString() {
        String str = "Books:\n";
        for (Book b : storage) {
            str += b.toString();
        }

        return str;
    }
}
