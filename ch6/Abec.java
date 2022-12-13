package ch6;
import java.util.Scanner;

public class Abec {
    private static Scanner console = new Scanner(System.in);
    


    public static boolean isAbecedarian(String x) {
        char initial = x.charAt(0);
        for (int i = 0; i < x.length(); i++) {
            char letter = x.charAt(i);

            System.out.println(letter);
            Boolean comparison = initial > letter;
            System.out.println(comparison);
            System.out.println(initial + " compare " + letter);
            if (comparison == true)
            {   System.out.println("initial less than letter "+initial + letter);
                return false;}
            System.out.println(comparison);
            System.out.println(initial + " compare " + letter);
            initial = letter;

        }
        
        System.out.println(x + " is Abecadarian");
        return true;
    }

    public static void main(String[] args) {

        System.out.print("Input string to x: ");
        String x = console.next();
        isAbecedarian(x);


    }    
}
