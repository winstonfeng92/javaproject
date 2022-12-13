package ch6;
import java.util.Scanner;

public class Gauss {
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

    public static void gaussGuess(double x, int n) {

        double neg = 1;
        double power = x*x;
        double factorialDivide = 1;
    
    
        for (int i = 1; i <= n; i++ ) {
            double p1 = neg * -1;
            double p2 = power * x * x;
            double p3 = factorialDivide*i;
            double result = p1*p2*p3;
            double  finresult = 1;
            double finresult2 = finresult+result;
            System.out.printf("\n Step: %d P1: %f P2: %f P3: %f Result: %f, finResult: %f", i, p1, p2, p3, result, finresult2 );
            neg = p1;
            power = p2;
            factorialDivide = p3;

        }
    }

    public static void main(String[] args) {

        System.out.print("Input number to x: ");
        checker();
        double x = console.nextDouble();

        System.out.print("Input number to n: ");
        checker();
        int n = console.nextInt();

        gaussGuess(x,n);
    }

}
