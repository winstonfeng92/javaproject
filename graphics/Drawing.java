package graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Rectangle;

public class Drawing extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Drawing drawing = new Drawing();
        drawing.setSize(800, 500);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);
    }


    public void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }

    public void mickey(Graphics g, Rectangle bb) {
        boxOval(g, bb);

        int hx = bb.width / 2;
        int hy = bb.height / 2;
        Rectangle half = new Rectangle(bb.x, bb.y, hx, hy);

        half.translate(-hx / 2, -hy / 2);
        boxOval(g, half);

        half.translate(hx * 2, 0);
        boxOval(g, half);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        mickey(g, getBounds());
        g.setColor(Color.BLUE);
        g.drawLine(0,0,40,50);
    }
}




    
