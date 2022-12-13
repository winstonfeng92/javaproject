/**
 * Simulates a simple card game.
 */

package ch13;
import ch12.Card;
import java.util.Random;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class War {

    public static void main(String[] args) {

        // create and shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();

        // divide the deck into piles
        Pile p1 = new Pile();
        p1.addDeck(deck.subdeck(0, 25));
        Pile p2 = new Pile();
        p2.addDeck(deck.subdeck(26, 51));

        // while both piles are not empty
        while (!p1.isEmpty() && !p2.isEmpty()) {
            Card c1 = p1.popCard();
            Card c2 = p2.popCard();
            int counter =0;
            counter = counter +1;
            System.out.println("Round "+counter);

            // compare the cards
            int diff = c1.getRank() - c2.getRank();
            Pile p3 = new Pile();
            boolean isTie= false;
            if (diff > 0) {
                p1.addCard(c1);
                p1.addCard(c2);
            } else if (diff < 0) {
                p2.addCard(c1);
                p2.addCard(c2);
            
            } else if(p1.getSize() < 4 || p2.getSize() < 4) {
                System.out.println("GG");
                break;
            } 
            else do {
                System.out.println("war");
                p3.addCard(c1);
                p3.addCard(c2);
                p3.addCard(p1.popCard());
                p3.addCard(p2.popCard());
                p3.addCard(p1.popCard());
                p3.addCard(p2.popCard());
                Card c3 = p1.popCard();
                Card c4 = p2.popCard();
                diff = c3.getRank()-c4.getRank();
                p3.addCard(c3);
                p3.addCard(c4);

                if(diff > 0) {
                    p1.addPile(p3);
                    isTie=false;
                } else if (diff < 0) {
                    p2.addPile(p3);
                    isTie=false;
                } else {isTie=true;}
            } while (isTie);
        }

        // display the winner
        if (p2.isEmpty()) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }

}
