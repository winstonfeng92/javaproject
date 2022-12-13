package ch6;
import java.util.Scanner;


public class Doubloon {
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

    public static void main(String[] args) {

        System.out.print("Input string to x: ");
        String x = console.next();
        isDoubloon(x);


    }    
}
