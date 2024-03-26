import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class AbstractBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                paintBorder(this, g, 0, 0, getWidth(), getHeight());
            }

            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                g.setColor(Color.RED);
                g.drawRect(x, y, width - 1, height - 1);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
