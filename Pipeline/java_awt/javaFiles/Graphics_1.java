import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Line Example");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MyPanel());
        frame.setVisible(true);
    }
}

class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 200, 200);
    }
}
