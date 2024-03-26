import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Polygon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 300));
        frame.add(new MyPanel());
        frame.setVisible(true);
    }
}

class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[] xPoints = {50, 100, 150, 200};
        int[] yPoints = {50, 100, 200, 150};
        g.setColor(Color.RED);
        g.drawPolygon(xPoints, yPoints, 4);
    }
}
