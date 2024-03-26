import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class BasicBorders_SplitPaneBorder_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                BasicBorders.SplitPaneBorder border = new BasicBorders.SplitPaneBorder();
                border.paintBorder(this, g, 0, 0, getWidth(), getHeight());
            }
        };

        frame.add(panel);
    }
}
