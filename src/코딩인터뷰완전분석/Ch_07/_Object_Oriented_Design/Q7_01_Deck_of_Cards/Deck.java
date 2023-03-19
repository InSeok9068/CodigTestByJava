package 코딩인터뷰완전분석.Ch_07._Object_Oriented_Design.Q7_01_Deck_of_Cards;


import 코딩인터뷰완전분석.CtCILibrary.CtCILibrary.AssortedMethods;

import java.util.ArrayList;

public class Deck<T extends Q7_01_Deck_of_Cards.Card> {
    private ArrayList<T> cards;
    private int dealtIndex = 0; // marks first undealt card

    public Deck() {
    }

    public void setDeckOfCards(ArrayList<T> deckOfCards) {
        cards = deckOfCards;
    }

    public void shuffle() {
        for (int i = 0; i < cards.size(); i++) {
            int j = AssortedMethods.randomIntInRange(i, cards.size() - i - 1);
            T card1 = cards.get(i);
            T card2 = cards.get(j);
            cards.set(i, card2);
            cards.set(j, card1);
        }
    }

    public int remainingCards() {
        return cards.size() - dealtIndex;
    }

    public T[] dealHand(int number) {
        if (remainingCards() < number) {
            return null;
        }

        T[] hand = (T[]) new Q7_01_Deck_of_Cards.Card[number];
        int count = 0;
        while (count < number) {
            T card = dealCard();
            if (card != null) {
                hand[count] = card;
                count++;
            }
        }

        return hand;
    }

    public T dealCard() {
        if (remainingCards() == 0) {
            return null;
        }

        T card = cards.get(dealtIndex);
        card.markUnavailable();
        dealtIndex++;

        return card;
    }

    public void print() {
        for (Q7_01_Deck_of_Cards.Card card : cards) {
            card.print();
        }
    }
}
