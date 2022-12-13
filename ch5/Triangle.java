import java.util.Scanner;


public class Triangle {
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
       System.out.println(a + "\n"+b+"\n"+c+"\n");

       if (a+b > c && a+c >b && c+b > a)
       {System.out.println("Triangle Possible");}
       else
       {System.out.println("triangle not possible");}

}
}