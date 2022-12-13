package ch9;
import java.util.Scanner;



public class Myexp {
    
    private static Scanner console = new Scanner(System.in);


    public static double myexp(double x, int n){
        double result = 1;
        double p = 1;
        double q = 1;
        for (int i=1;i<n;i++){
           result += (p*=x)/(q*=i);
        } 
        return result;
     }

    public static void show(double n) {
        for (double i = .1; i <=100; i*=10) {
            check(i);
        }
    }

    public static void check (double n) {
        System.out.printf("%f \t %f \t %f %n", n, myexp(n, 40),Math.exp(n));
    }

    public static void main(String[] args) {

        // System.out.print("Input number to x: ");
        // int x = console.nextInt();
        show(20);
    }    
}
