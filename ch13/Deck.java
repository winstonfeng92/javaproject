package ch13;
import ch12.Card;
import java.util.Random;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class Deck {
    private Card[] cards;
    private static final Random RANDOM = new Random();

    public Deck(int n) {
        this.cards = new Card[n];
    }

    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    public Card[] getCards() {
        return this.cards;
    }

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

        //toString deck to a string

    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Card card : this.cards) {
            String line = card.toString();
            text.append(line);
            text.append('\n');
        }
        return text.toString();
    }



    public void shuffle() {
        for (int i = 0; i<this.cards.length;i++) {
            swapCards(i,randomInt(0, this.cards.length));
        }
    }


    private static int randomInt(int low, int high) {
        // return a random number between low and high,
        // including both
        return RANDOM.nextInt(high-low)+low;

    }

    private void swapCards(int i, int j) {
        Card swap1 = this.cards[i];
        this.cards[i] = this.cards[j];
        this.cards[j] = swap1;

        // swap the ith and the jth cards in the array
    }


    private int indexLowest(int low, int high) {
        // find the lowest card between low and high
        int lowest = low;
        for (int i=low; i<=high; i++) {
            if(this.cards[i].compareTo(this.cards[lowest]) == -1) {
                lowest = i;
            }
        }
        return lowest;

    }

    public void selectionSort() {
        for (int i = 0; i <this.cards.length; i++) {
            swapCards(i, indexLowest(i,cards.length-1));
            // find the lowest card at or to the right of i
            // swap the ith card and the lowest card found
        }
    }
    

    private static Deck merge(Deck d1, Deck d2) {
        // create a new deck, d3, big enough for all the cards
        Deck d3 = new Deck(d1.cards.length+d2.cards.length);
        // use the index i to keep track of where we are at in
        // the first deck, and the index j for the second deck
        int i = 0;
        int j = 0;
    
        // the index k traverses the result deck
        for (int k = 0; k < d3.cards.length; k++) {
            System.out.println("i: "+i+" j: "+j);
            if (i >= d1.cards.length) {
                d3.cards[k] = d2.cards[j];
                j++;
            }
            else if (j >= d2.cards.length) {
                d3.cards[k] = d1.cards[i];
                i++;
            }
            else if (d1.cards[i].compareTo(d2.cards[j]) == -1) {
                d3.cards[k] = d1.cards[i];
                i++;
            }
            else {
                d3.cards[k] = d2.cards[j];
                j++;

            }

            // if d1 is empty, use top card from d2
            // if d2 is empty, use top card from d1
            // otherwise, compare the top two cards
    
            // add lowest card to the new deck at k
            // increment i or j (depending on card)
        }
        // return the new deck
        return d3;
    }

    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }
    


    public Deck almostMergeSort() {
        int last = this.cards.length -1;
        int mid = this.cards.length/2;
        Deck deck1 = subdeck(0,mid);
        Deck deck2 = subdeck(mid+1,last);
        deck1.selectionSort();
        deck2.selectionSort();
        Deck deck3 = merge(deck1,deck2);
        return deck3;


        // divide the deck into two subdecks 0 25 26 51
        // sort the subdecks using selectionSort
        // merge the subdecks, return the result
    }

    public Deck mergeSort() {
        // if the deck has 0 or 1 cards, return it
        // otherwise, divide the deck into two subdecks
        // sort the subdecks using mergeSort
        // merge the subdecks
        // return the result
        if (this.cards.length <=1) {
            return this;
        }
        else return this.almostMergeSort();
    }

    public Deck insertionSort() {
        for (int i = 1; i<this.cards.length; i++) {
            for (int k=i; k > 0 && this.cards[k].compareTo(this.cards[k-1]) == -1 ; k--) {
                swapCards(k, k-1);
            }
        }
        return this;
    }
    



    public static void main(String[] args) {
        System.out.println("hello");
        Deck deck = new Deck();
        Deck deck2 = new Deck();
        //5deck.print();
        //System.out.println(randomInt(0,52));
        //deck.swapCards(0,51);
        //deck.print();
        //Deck.randomInt(0, 200);
        deck.shuffle();
        //System.out.println(deck.toString());
        //System.out.println(deck.indexLowest(0,51));
        //deck.selectionSort();
        //System.out.println(deck.toString());
        //System.out.println(deck.cards.length);
        //Deck deck3 = merge(deck,deck2);
        //deck3.print();
        //System.out.println(deck + "\n");
        //Deck d5 = deck.mergeSort();
        //System.out.println(d5);
        //deck.print();
        Deck d6 = deck.insertionSort();
        System.out.println("\n"+d6);







    }
}
