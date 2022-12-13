import java.util.Scanner;


public class Quadratic {
   
   
    private static Scanner console = new Scanner(System.in);

    public static void checker(){
        if (!console.hasNextDouble()) {
            String word = console.next();
            System.err.println(word + " is not a number");
            System.exit(0);}
    }
    public static void main(String args[]){
       System.out.print("Input a: ");
       checker();
       double a = console.nextInt();
       if (a==0){
        System.err.println("0 cannot be used");
        System.exit(0);
       }
       System.out.print("Input b: ");
       checker();
       double b = console.nextInt();
       System.out.print("Input c: ");
       checker();
       double c = console.nextInt();
       double d= b * b - 4.0 * a * c;
       System.out.println(a + "\n"+b+"\n"+c+"\n"+d);  
       if (d> 0.0)   
       {  
       double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
       double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
       System.out.println("The roots are " + r1 + " and " + r2);  
       }   
       else if (d == 0.0)   
       {  
       double r1 = -b / (2.0 * a);  
       System.out.println("The root is " + r1);  
       }   
       else   
       {  
       System.out.println("Roots are not real.");  }
 

 
       
       //System.out.printf("Your guess is: %d\n", guess);
       //System.out.printf("The number I was thinking of is: %d\n", answer);
       //System.out.printf("You were off by: %d\n", Math.abs(guess - answer));
       console.close();}
}
