import java.util.Scanner;


public class Fermat {
    private static Scanner console = new Scanner(System.in);

   public static void main(String args[]){
      System.out.print("Input a: ");
      int a = console.nextInt();
      System.out.print("Input b: ");
      int b = console.nextInt();
      System.out.print("Input c: ");
      int c = console.nextInt();
      System.out.print("Input n: ");
      int n = console.nextInt();

      if (n > 2 && Math.pow(a,n)+ Math.pow(b,n) == Math.pow(c,n))
      {System.out.println("Holy smokes, fermat was wrong!");}
      else
      {System.out.println("No, that doesn't work");}

      
      //System.out.printf("Your guess is: %d\n", guess);
      //System.out.printf("The number I was thinking of is: %d\n", answer);
      //System.out.printf("You were off by: %d\n", Math.abs(guess - answer));
      console.close();
   }  
}
