package graphics;

import java.awt.*;
import javax.swing.*;

public class MickeyMouse extends Canvas{
   public static void main(String[] args){
      JFrame frame = new JFrame("Window Title");
      Canvas canvas = new MickeyMouse();
      canvas.setSize(400, 400);
      frame.add(canvas);
      frame.pack();
      frame.setVisible(true);
   }
   public void paint(Graphics g){
      // Drawing codes
      Color ty = new Color(102,204,255);
      g.setColor(ty);
      Rectangle r = new Rectangle(152,304,96,96);
      mickey(g, r);
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
}
