public class blimp {
    public static void main(String[] args) {
        zippo("rattle", 13); //1st line of code to execute
    }
    public static void baffle(String blimp) { //line 3 comes here
        System.out.println(blimp);
        zippo("ping", -5); //line 4
    }
    public static void zippo(String quince, int flag) { //2nd line of code to go
        if (flag < 0) {
            System.out.println(quince + " zoop"); //line 5
        } else {
            System.out.println("ik"); //line 2 comes here
            baffle(quince);
            System.out.print("boo-wa-ha-ha");
        }
    }
    
    
}

//blimp = quince = rattle 