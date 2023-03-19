package 코딩인터뷰완전분석.Ch_07._Object_Oriented_Design.Q7_01_Deck_of_Cards;

import java.util.ArrayList;

public class BlackJackGameAutomator {
    private Deck<Q7_01_Deck_of_Cards.BlackJackCard> deck;
    private final Q7_01_Deck_of_Cards.BlackJackHand[] hands;
    private static final int HIT_UNTIL = 16;

    public BlackJackGameAutomator(int numPlayers) {
        hands = new Q7_01_Deck_of_Cards.BlackJackHand[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            hands[i] = new Q7_01_Deck_of_Cards.BlackJackHand();
        }
    }

    public boolean dealInitial() {
        for (Q7_01_Deck_of_Cards.BlackJackHand hand : hands) {
            Q7_01_Deck_of_Cards.BlackJackCard card1 = deck.dealCard();
            Q7_01_Deck_of_Cards.BlackJackCard card2 = deck.dealCard();
            if (card1 == null || card2 == null) {
                return false;
            }
            hand.addCard(card1);
            hand.addCard(card2);
        }
        return true;
    }

    public ArrayList<Integer> getBlackJacks() {
        ArrayList<Integer> winners = new ArrayList<Integer>();
        for (int i = 0; i < hands.length; i++) {
            if (hands[i].isBlackJack()) {
                winners.add(i);
            }
        }
        return winners;
    }

    public boolean playHand(int i) {
        Q7_01_Deck_of_Cards.BlackJackHand hand = hands[i];
        return playHand(hand);
    }

    public boolean playHand(Q7_01_Deck_of_Cards.BlackJackHand hand) {
        while (hand.score() < HIT_UNTIL) {
            Q7_01_Deck_of_Cards.BlackJackCard card = deck.dealCard();
            if (card == null) {
                return false;
            }
            hand.addCard(card);
        }
        return true;
    }

    public boolean playAllHands() {
        for (Q7_01_Deck_of_Cards.BlackJackHand hand : hands) {
            if (!playHand(hand)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> getWinners() {
        ArrayList<Integer> winners = new ArrayList<Integer>();
        int winningScore = 0;
        for (int i = 0; i < hands.length; i++) {
            Q7_01_Deck_of_Cards.BlackJackHand hand = hands[i];
            if (!hand.busted()) {
                if (hand.score() > winningScore) {
                    winningScore = hand.score();
                    winners.clear();
                    winners.add(i);
                } else if (hand.score() == winningScore) {
                    winners.add(i);
                }
            }
        }
        return winners;
    }

    public void initializeDeck() {
        ArrayList<Q7_01_Deck_of_Cards.BlackJackCard> cards = new ArrayList<Q7_01_Deck_of_Cards.BlackJackCard>();
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j <= 3; j++) {
                Q7_01_Deck_of_Cards.Suit suit = Q7_01_Deck_of_Cards.Suit.getSuitFromValue(j);
                Q7_01_Deck_of_Cards.BlackJackCard card = new Q7_01_Deck_of_Cards.BlackJackCard(i, suit);
                cards.add(card);
            }
        }

        deck = new Deck<Q7_01_Deck_of_Cards.BlackJackCard>();
        deck.setDeckOfCards(cards);
        deck.shuffle();
    }

    public void printHandsAndScore() {
        for (int i = 0; i < hands.length; i++) {
            System.out.print("Hand " + i + " (" + hands[i].score() + "): ");
            hands[i].print();
            System.out.println();
        }
    }
}
