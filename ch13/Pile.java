package ch13;
import ch12.Card;

import java.util.ArrayList;

/**
 * A pile of playing cards (of variable size).
 */
public class Pile {

    private ArrayList<Card> cards;

    /**
     * Constructs an empty pile of cards.
     */
    public Pile() {
        this.cards = new ArrayList<Card>();
    }

    /**
     * Adds a card to the bottom of the pile.
     */
    public void addCard(Card card) {
        this.cards.add(card);
    }

    /**
     * Copies an entire deck into the pile.
     */
    public void addDeck(Deck deck) {
        for (Card card : deck.getCards()) {
            this.cards.add(card);
        }
    }

    public void addPile(Pile pile) {
        for (Card card : pile.cards) {
            this.addCard(card);
        }
    }

    public void printCards() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    public int getSize() {
        return this.cards.size();
    }


    /**
     * Returns true if this pile has no cards.
     */
    public boolean isEmpty() {
        return this.cards.isEmpty();
    }

    /**
     * Removes a card from the top of the pile.
     */
    public Card popCard() {
        return this.cards.remove(0);
    }

}
