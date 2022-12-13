package ch9;
import java.math.BigInteger;


public class Encryption {
    
    public static BigInteger pow(int x, int n) {
        BigInteger bi = BigInteger.valueOf(1);
        if (n == 0) return bi;
    
        // find x to the n/2 recursively
         BigInteger t = pow(x, n / 2);
         BigInteger tsq = t.multiply(t);
    
        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n % 2 == 0) {
            System.out.println("y");
            return tsq;
        } else {
            System.out.println("x");
            return tsq.multiply(BigInteger.valueOf(x));
        }
    }

    public static void main(String[] args) {
    System.out.println(pow(5,5));

    }    
    
}
