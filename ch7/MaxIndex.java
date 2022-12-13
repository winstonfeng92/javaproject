package ch7;

public class MaxIndex {
    


    public static int indexOfMax(int[] n) {
        int value = n[0];
        int tracker = 0;
        for (int i=0; i< n.length; i++) {
            if (value < n[i]) {
                value = n[i];
                tracker = i;
            } 
        }

        System.out.println("Highest value: " + value + " at index: " + tracker);
        return tracker;
    }
    public static void main(String[] args) {

        int[] n = {1,2,3,5,6};
        indexOfMax(n);



    }    
}
