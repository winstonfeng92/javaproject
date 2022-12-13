package ch8;
import java.util.Scanner;



public class Odds {
    
    private static Scanner console = new Scanner(System.in);

    public static void beer(int n){
        if (n==0) {
            System.out.println("\n done");
            return;
        }
        beerLyric(n);
        beer(n-1);

    }

    public static void beerLyric(int n){
        System.out.printf("\n %d bottles of beer on the wall, %d bottles of beer, ya’ take one down, ya’ pass it around, %d bottles of beer on the wall.", n,n,n-1);
    }


    public static int odds(int n){
        if (n==0) {
            System.out.println("done n: "+n);
            return 0;
        }
        if (n%2==0) {
            odds(n-1);
            System.out.println("n even "+n);
            return 0;
        }
        else{
        int recurse = odds(n-1);
        odds(n-1);
        int result = recurse +n ;
        System.out.println("n odd " + n+" recurse "+ result);
        return result;}

    }


    public static int factorial(int n) {
        if (n == 0) {
            return 0;
        }
        if (n%2==0) {
            return factorial(n-1);
        }
        int recurse = factorial(n - 1);
        int result = n + recurse;
        System.out.println("n "+n+ " recurse "+recurse+ " result "+result);
        return result;
    }

    public static void main(String[] args) {

        System.out.print("Input number to x: ");
        int x = console.nextInt();
        factorial(x);



    }    
}