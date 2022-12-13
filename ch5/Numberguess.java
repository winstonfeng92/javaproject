import java.util.Scanner;
import java.util.Random;

public class Numberguess{
    private static Scanner console = new Scanner(System.in);


    public static void highLow(int x, int answer) {
        if (x> answer || x < answer)
        {System.out.printf("Your guess is: %d," + (x > answer ? " too high \n" : " too low \n"), x);
        System.out.println("Guess again: ");
        x = console.nextInt();
        highLow(x, answer);}

        else
        {System.out.printf("Your guess is: %d, correct! \n", x);}
    }

   public static void main(String args[]){
      System.out.println("\n I'm thinking of a number between 1 and 100");
      System.out.println("(including both). Can you guess what it is?");
      System.out.print("Type a number: ");
      
      int guess = console.nextInt();
      Random random = new Random();
      int answer = random.nextInt(100) + 1;
      highLow(guess, answer);
      
      //System.out.printf("Your guess is: %d\n", guess);
      //System.out.printf("The number I was thinking of is: %d\n", answer);
      //System.out.printf("You were off by: %d\n", Math.abs(guess - answer));
      console.close();
   }
}