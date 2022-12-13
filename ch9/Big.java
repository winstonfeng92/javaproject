package ch9;
import java.util.Scanner;
import java.math.BigInteger;



public class Big {
    
    private static Scanner console = new Scanner(System.in);



    public static BigInteger factorial(int n) {
        BigInteger result = new BigInteger("1");
        for (int i = n; i>0; i--) {

        result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void show(int n) {
        for (int i = 1; i <=n; i++) {
            System.out.println(factorial(i));
        }
    }

    public static void main(String[] args) {

        System.out.print("Input number to x: ");
        int x = console.nextInt();
        show(x);
    }    
}
