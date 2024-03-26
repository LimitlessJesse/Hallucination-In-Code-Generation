import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class AbstractBorder_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(new AbstractBorder() {
            @Override
            public Insets getBorderInsets(Component c, Insets insets) {
                insets.left = 10;
                insets.right = 10;
                insets.top = 10;
                insets.bottom = 10;
                return insets;
            }
        });

        panel.setBackground(Color.RED);
        frame.add(panel);
        frame.setVisible(true);
    }
}
