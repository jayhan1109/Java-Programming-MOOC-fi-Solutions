import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {

        if (this.isEmpty()) {
            return null;
        }

        Person person = persons.get(0);

        for (Person p : persons) {
            if (person.getHeight() > p.getHeight()) {
                person = p;
            }
        }

        return person;
    }

    public Person take() {
        if (this.isEmpty()) {
            return null;
        }

        Person person = this.shortest();
        persons.remove(person);
        return person;
    }
}
