
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account ac = new Account("Matthews account", 1000);
        Account ac2 = new Account("My account", 0);

        ac.withdrawal(100.0);
        ac2.deposit(100.0);

        System.out.println(ac);
        System.out.println(ac2);
    }
}
