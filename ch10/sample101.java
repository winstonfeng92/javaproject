package ch10;
import java.awt.Point;
import java.awt.Rectangle;


public class sample101 {
    
    public static int riddle(int x, Point p) {
        x = x + 7;
        return x + p.x + p.y;
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }
    

    public static void main(String[] args) {
        // int x = 5;
        // Point blank = new Point(1, 2);

        // System.out.println(riddle(x, blank));
        // System.out.println(x);
        // System.out.println(blank.x);
        // System.out.println(blank.y);

        // System.out.println("\n");

        Rectangle box1 = new Rectangle(2, 4, 7, 9);
        Point p1 = findCenter(box1);
        System.out.println(p1);
        System.out.println(box1);

        box1.grow(5, 5);
        Point p2 = findCenter(box1);
        System.out.println(p2);
        System.out.println(box1);

    }

}
