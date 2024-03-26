import javax.swing.*;
import java.awt.*;

public class SpringLayout_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new SpringLayout());

        JButton button = new JButton("Button");
        JLabel label = new JLabel("Label");

        panel.add(button);
        panel.add(label);

        SpringLayout layout = (SpringLayout) panel.getLayout();
        layout.putConstraint(SpringLayout.WEST, button, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, button, 50, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, label, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label, 50, SpringLayout.NORTH, panel);

        frame.add(panel);
        frame.setVisible(true);
    }
}
