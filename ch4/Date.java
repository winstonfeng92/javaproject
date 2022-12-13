public class Date {
    
    public static void printAmerican(String day, String month, int date, int year){
        System.out.println(day + ", "+month+ " " + date + ", " + year);
    }
    
    public static void printEuropean(String day, String month, int date, int year){
        System.out.println(day + " " + date + " " + month + " " + year);
    }
    
    public static void main(String args[]){
   
        String day = "Wednesday", month = "July";
        int date = 20, year = 2016;
        
        System.out.println("American format:");
        printAmerican(day, month, date, year);
        System.out.println("European format:");
        printEuropean(day, month, date, year);
     }
}
