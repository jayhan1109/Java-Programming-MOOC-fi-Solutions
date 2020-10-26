

public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Book)) {
            return false;
        }

        Book b = (Book) o;

        if (this.name.equals(b.name) && this.publicationYear == b.publicationYear) {
            return true;
        }

        return false;
    }
}
