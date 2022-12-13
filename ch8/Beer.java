package ch8;
import java.util.Scanner;



public class Beer {
    
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

    public static void main(String[] args) {

        System.out.print("Input number to x: ");
        int x = console.nextInt();
        beer(x);



    }    
}
