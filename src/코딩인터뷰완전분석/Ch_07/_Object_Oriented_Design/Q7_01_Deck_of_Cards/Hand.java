package Q7_01_Deck_of_Cards;

import java.util.ArrayList;

public class Hand<T extends Q7_01_Deck_of_Cards.Card> {
    protected ArrayList<T> cards = new ArrayList<T>();

    public int score() {
        int score = 0;
        for (T card : cards) {
            score += card.value();
        }
        return score;
    }

    public void addCard(T card) {
        cards.add(card);
    }

    public void print() {
        for (Q7_01_Deck_of_Cards.Card card : cards) {
            card.print();
        }
    }
}
