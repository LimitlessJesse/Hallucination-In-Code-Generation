import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_ScrollPaneBorder_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                MetalBorders.ScrollPaneBorder border = new MetalBorders.ScrollPaneBorder();
                border.paintBorder(this, g, 0, 0, getWidth(), getHeight());
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
