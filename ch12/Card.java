package ch12;
import java.util.Arrays;

/**
 * A standard playing card.
 */
public class Card {

    public static final String[] RANKS = {
        null, "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"};

    private final int rank;

    private final int suit;

    /**
     * Constructs a card of the given rank and suit.
     */
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Returns a negative integer if this card comes before
     * the given card, zero if the two cards are equal, or
     * a positive integer if this card comes after the card.
     */
    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            if (this.rank==1) {
                return 1;
            }
             return -1;
        }
        if (this.rank > that.rank) {
            if (that.rank==1) {
                return -1;
            }
            return 1;
        }
        return 0;
    }

    /**
     * Returns true if the given card has the same
     * rank AND same suit; otherwise returns false.
     */
    public boolean equals(Card that) {
        return this.rank == that.rank
            && this.suit == that.suit;
    }

    /**
     * Gets the card's rank.
     */
    public int getRank() {
        return this.rank;
    }

    /**
     * Gets the card's suit.
     */
    public int getSuit() {
        return this.suit;
    }

    /**
     * Returns the card's index in a sorted deck of 52 cards.
     */
    public int position() {
        return this.suit * 13 + this.rank - 1;
    }

    /**
     * Returns a string representation of the card.
     */
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    public static Card[] makeDeck(){
        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
        return cards;
    }


    public static void printDeck(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public static int[] suitHist(Card[] cards) {
        int[] suitHistogram = new int[4];
        for (Card card : cards) {
            suitHistogram[card.getSuit()]++;
        }
        return suitHistogram;
    }

    public static int[] rankHist(Card[] cards) {
        int[] rankHistogram = new int[14];
        for (Card card : cards) {
            rankHistogram[card.getRank()]++;
        }
        return rankHistogram;
    }

    public static boolean hasFlush(Card[] cards) {
        int[] suitHistogram = suitHist(cards);
        for (int i=0; i < suitHistogram.length; i++) {
            if (suitHistogram[i] > 4) {
                return true;
            }
        }
        return false;
    }



    public static boolean hasRoyalFlush(Card[] cards) {
        if (!hasFlush(cards)) {
            return false;
        }
        int[] rankHistogram = rankHist(cards);
        int[] royalStraight = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
        boolean royalFlushCondition = true;
        for (int i = 0; i<rankHistogram.length;i++) {
            if (rankHistogram[i]<royalStraight[i]) {
                return false;
            }
            
        }
        return royalFlushCondition;
        


    }

    public static int searchUnsorted(Card[] cards, Card target){
        for (int i = 0; i < cards.length; i++) {
           if (cards[i].equals(target)) {
              return i; 
           }
        }
        return -1;
     }
     public static int searchSorted(Card[] cards, Card target, int low, int high) {
        if (high < low) { 
           return -1;}
        int mid = (low + high) / 2;
        int comp = cards[mid].compareTo(target);
        if (comp == 0) {
           return mid;
        } 
        else if (comp < 0) {
           return searchSorted(cards, target, mid + 1, high);
        } 
        else {
           return searchSorted(cards, target, low, mid - 1);
        }
     }

    public static void main(String[] args) {
        System.out.println("hello");
        Card[] cards = makeDeck();
        printDeck(cards);
        System.out.println(Arrays.toString(suitHist(cards)));
        System.out.println(hasFlush(cards));
        System.out.println(Arrays.toString(rankHist(cards)));
        System.out.println(hasRoyalFlush(cards));


    }

}

