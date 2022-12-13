public class Multadd {
    
    public static double multAdd(double a, double b, double c){
        double result = a*b+c;
        System.out.println(result);
        return result;
    }

    public static double expSum(double x){
        double a= x;
        double b = Math.exp(-x);
        double c = Math.sqrt(1- Math.exp(-x));
        double result = multAdd(a,b,c);
        System.out.println("expSum "+result);
        return result;
    }

    public static void main(String[] args) { 
        double a = 1;
        double b = 2;
        double c = 3;
        double result = multAdd(a,b,c);
        System.out.println("hello"+result);

        double a2 = Math.cos(Math.PI/4.0);
        double b2 = .5;
        double c2 = Math.sin(Math.PI/4.0) + Math.log(10)+Math.log(20);
        multAdd(a2,b2,c2);
        expSum(1.0);
    }

}
