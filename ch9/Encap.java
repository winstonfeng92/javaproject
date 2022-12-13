package ch9;
import java.util.Scanner;
import java.util.Arrays;




public class Encap {
    
    private static Scanner console = new Scanner(System.in);



    public static double[] powArray(double[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], n);
        }
        return a;
    }

    public static int counter(String s) {

        int count =0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // System.out.print("Input number to x: ");
        // int x = console.nextInt();
        //show(20);

        double[] a = {1, 2, 3, 4, 5};
        double[] b = powArray(a,3);
        System.out.println(a);
        System.out.println(Arrays.toString(b));
        String s = "((3 + 7) * 2)";
        System.out.println(counter(s));


    }    
}