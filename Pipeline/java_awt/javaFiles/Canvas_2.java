import java.awt.*;
import java.awt.event.*;

public class Canvas_2 extends Canvas {
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 100, 100);
    }

    public static void main(String[] args) {
        Main canvas = new Main();
        canvas.setSize(300, 300);
        canvas.setVisible(true);
    }
}
