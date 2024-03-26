import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Arc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 300));
        frame.add(new DrawArcPanel());
        frame.setVisible(true);
    }
}

class DrawArcPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawArc(50, 50, 100, 100, 0, 180);
    }
}
