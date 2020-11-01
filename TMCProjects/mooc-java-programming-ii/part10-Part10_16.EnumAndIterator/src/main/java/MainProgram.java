
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Employees t = new Employees();
        Person p = new Person("Arto", Education.PHD);
        t.add(p);
        t.print(Education.PHD);
    }
}
