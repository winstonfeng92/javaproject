import java.util.Scanner;


public class Exercise2 {
    public static void main(String[] args) {
        double cel;
        double b;
        
        //= 2 * (9.0/5.0) +32;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter in Celcius ");
        cel = in.nextDouble();
        System.out.print(cel);
        b = cel * (9.0/5.0) +32;
        System.out.print("\n");
        System.out.printf("%2f C = %2f F", cel, b);
        in.close();

        



    }

}
