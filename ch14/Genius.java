
import ch12.Card;
import java.util.ArrayList;

public class Genius extends Player {
    public Genius(String name) {
        super(name);
    }

    public Card geniusPlay(Eights eights, Card prev) {
        Card card = searchForMatch(prev);
        System.out.println("geniusgeniusgeniusgeniusgeniusgeniusgeniusgeniusgeniusgeniusgenius");
        if (card == null) {
            card = play(eights,prev);
        }
        return card;
    }
    public Card searchForMatch(Card prev) {
        System.out.println("hellaofa;sdlkfja;lsdkjfa;sldkfj \n \n");
        for (int i = 0; i < getHand().size(); i++) {
            Card card = getHand().getCard(i);
            if (cardMatches(card, prev)) {
                return getHand().popCard(i);
            }
        }
        return null;
    }

    //create an array with all matches
    //sort array
    //return highest value in array

    public static boolean cardMatches(Card card1, Card card2) {
        return card1.getSuit() == card2.getSuit()
            || card1.getRank() == card2.getRank()
            || card1.getRank() == 8;

    }
}



