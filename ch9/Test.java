package ch9;

public class Test {
    
    public static void main(String[] args) {
        String x = "hello";
        String f = "mn";
        char y = 'l';
        y++;
        //y= y+1;

        int i = 5;
        double j = 79.23;

        System.out.println(x+y); //1 string concat
        System.out.println(i+x);
        System.out.println(j+y); //primitive char converts to number
        System.out.println(i+y); //primitive char convertsto number when added to int or double
        System.out.println(j+x);
        System.out.println(y+1);
        System.out.println(f+i); //string plus numbers concatenates the string
        
    }



}
