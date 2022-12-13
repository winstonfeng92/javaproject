package ch7;
import java.util.Scanner;
import java.util.Arrays; 



public class Sieve {
    
    private static Scanner console = new Scanner(System.in);

    public static int indexOfMax(int[] n) {
        int value = n[0];
        int tracker = 0;
        for (int i=0; i< n.length; i++) {
            if (value < n[i]) {
                value = n[i];
                tracker = i;
            } 
        }

        System.out.println("Highest value: " + value + " at index: " + tracker);
        return tracker;
    }

    public static Boolean[] sieve(int n) {
        Boolean[] tracker = new Boolean[n];
        Arrays.fill(tracker, true);

        for (int i=2; i < n; i++) {
                if(tracker[i]) {
                    //print prime number
                    System.out.println("prime number: "+i);
                    for (int j=2*i; j < n; j+=i) {
                            tracker[j] = false;
                        } 
                    }
                }
    
        

        System.out.println(Arrays.toString(tracker));
        return tracker;
    }

    public static void main(String[] args) {

        System.out.print("Input number to x: ");
        int x = console.nextInt();
        sieve(x);



    }    
}
