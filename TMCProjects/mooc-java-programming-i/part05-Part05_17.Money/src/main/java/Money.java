
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros(), this.cents + addition.cents()); // create a new Money object that has the correct worth

        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        return this.euros + 0.01 * this.cents < compared.euros() + 0.01 * compared.cents();
    }

    public Money minus(Money decreaser) {
        if (this.euros + 0.01 * this.cents < decreaser.euros() + 0.01 * decreaser.cents()) {
            return new Money(0, 0);
        }

        int newEuro = this.euros - decreaser.euros();
        int newCent = this.cents - decreaser.cents();

        if (newCent < 0) {
            newEuro -= 1;
            newCent += 100;
        }

        return new Money(newEuro, newCent);

    }
}
