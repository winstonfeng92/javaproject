package ch6;
import java.util.Scanner;


public class ExerciseSqrt {

private static Scanner console = new Scanner(System.in);

public static void checker(){
    // if (!console.hasNextDouble()) {
    //     String word = console.next();
    //     System.err.println(word + " is not a number");
    //     System.exit(0);}

    while (!console.hasNextDouble()) {
        String word = console.next();
        System.err.println(word + " is not a number");
        System.out.print("Enter a number: ");
    }
}

public static void main(String[] args) {

    System.out.print("Input number to sqrt: ");
    checker();
    double n = console.nextInt();
    squareRoot(n);
}



public static void squareRoot(double n) {
    double a = n;
    double x0 = n/2;
    double x1 = (x0+ a/x0)/2;
    double diff = Math.abs(x0-x1);

    while (diff > .0001) {
        System.out.println("xo: " + x0 + " x1: " + x1 + " diff: "+ (x0-x1));
        x0 = x1; 
        x1 = (x0+ a/x0)/2;
        diff = Math.abs(x0-x1);
    }
}





}
