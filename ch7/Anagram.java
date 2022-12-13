package ch7;
import java.util.Scanner;
import java.util.Arrays; 



public class Anagram {
    
    private static Scanner console = new Scanner(System.in);


    public static Boolean[] sieve(int n) {
        Boolean[] tracker = new Boolean[n+1];
        Arrays.fill(tracker, true);

        for (int i=2; i <= n; i++) {
                if(tracker[i]) {
                    //print prime number
                    System.out.println("prime number: "+i);
                    for (int j=i*i; j <= n; j+=i) {
                            tracker[j] = false;
                        } 
                    }
                }
    
        

        System.out.println(Arrays.toString(tracker));
        return tracker;
    }

    public static Boolean isPrimeFactor(int n, int[] a) {
        Boolean[] tracker = sieve(n);
        int factorMultiple = 1;
        for(int values : a) {
            System.out.println("assess "+values);
            factorMultiple = factorMultiple*values;
            System.out.println("multiple: "+factorMultiple);
            if(!tracker[values]) {
                System.out.println("false "+values);
                return false;
            }
        }

        if (factorMultiple != n) {
            System.out.println("Factormultipe "+factorMultiple+" doesnt equal "+n);
            return false;
        }

        System.out.println("true");
        return true;
    }
    public static Boolean isFactor(int n, int[] a) {
        for(int x : a) {
            System.out.println(x);
            if (n%x != 0){
                System.out.println("False " + x);
                return false;
            }
        }
        System.out.println("true");
        return true;

    }


    public static int[] letterHist(String x) {
        int[] histogram = new int[26];

        for (char letter : x.toCharArray()) {
            int index = letter - 'a';
            histogram[index]++;
        }
        return histogram;
    }

    public static Boolean anagram(String x, String y) {
        int[] histogram1 = letterHist(x);
        int[] histogram2 = letterHist(y);


        System.out.println(Arrays.toString(histogram1));
        System.out.println(Arrays.toString(histogram2));

        for (int i=0; i<histogram1.length; i++){
            if (histogram1[i] != histogram2[i]){
                System.out.println("does not equal at "+i);
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 7, 5};

        System.out.print("Input number to x: ");
        String x = console.next();
        System.out.print("Input number to y: ");
        String y = console.next();
        //isFactor(x,a);
        anagram(x,y);


    }    
}
