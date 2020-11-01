import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand o) {
        int card1 = this.cards
                .stream()
                .mapToInt(card -> card.getValue())
                .reduce(0, Integer::sum);

        int card2 = o.cards
                .stream()
                .mapToInt(card -> card.getValue())
                .reduce(0, Integer::sum);

        return card1 - card2;
    }

    public void sortBySuit() {
        Collections.sort(cards, (c1, c2) -> {
            if (c1.getSuit().ordinal() > c2.getSuit().ordinal()) {
                return 1;
            }

            if (c1.getSuit().ordinal() < c2.getSuit().ordinal()) {
                return -1;
            }

            return c1.getValue() - c2.getValue();
        });
    }
}
