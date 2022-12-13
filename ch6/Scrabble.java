package ch6;
import java.util.Scanner;


public class Scrabble {
    private static Scanner console = new Scanner(System.in);

   


    public static boolean isDoubloon(String x) {
        x = x.toLowerCase();
        for (int i = 0; i < x.length(); i++) {
            int charcounter = 0;
            char letter = x.charAt(i);
            for (int i2 = 0; i2 < x.length(); i2++) {
                char lettercol = x.charAt(i2);
                System.out.print(lettercol);
                if (letter == lettercol) {
                    charcounter ++;
                }
                
            }

            System.out.println(letter + " " + charcounter);
            if (charcounter != 2){
                System.out.print(" Not a dubloon!");
                return false;
            }

        }
            
        System.out.println(x+ " is a dubloon!");
        return true;
    }

    public static boolean isScrabble(String x, String y) {
        x = x.toLowerCase();
        //y = y.toLowerCase();
        for (int i = 0; i < x.length(); i++) {
            int charcounter = 0;
            char letter = x.charAt(i);
            for (int i2 = 0; i2 < x.length(); i2++) {
                char lettercol = x.charAt(i2);
                if (letter == lettercol) {
                    charcounter ++;}
                System.out.print(lettercol);
            }
            System.out.println(" "+letter + " " + charcounter);
            Boolean checkerbool = letterChecker(letter, y, charcounter);
            if (!checkerbool) {
                System.out.println(x + " doesn't scrabble into: " +y);
                return false;
            }


        }
        
        System.out.println(x + " scrabbles into: " +y);
        return true;
    }

    public static boolean letterChecker(char c, String y, int n) {
        int count = 0;

        for (int i = 0; i < y.length(); i++) {
            char letter = y.charAt(i);
            if (letter == c){
                count ++;
                System.out.println("count: " + count);
            }

        }

        if (count == 0 || n > count)
        {System.out.println("nope");
        return false;}
        System.out.println("yes");
        return true;

    }

    public static void main(String[] args) {

        System.out.print("Input string to x: ");
        String x = console.next();
        System.out.print("Input string to y: ");
        String y = console.next();
        isScrabble(x,y);


    }    
}
