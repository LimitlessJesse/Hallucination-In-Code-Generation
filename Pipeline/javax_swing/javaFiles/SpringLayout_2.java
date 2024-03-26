import javax.swing.*;
import java.awt.*;

public class SpringLayout_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new SpringLayout());

        JButton button = new JButton("Click me");
        frame.add(button);

        SpringLayout layout = (SpringLayout) frame.getLayout();
        layout.putConstraint(SpringLayout.WEST, button, 50, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, button, 50, SpringLayout.NORTH, frame);

        frame.setVisible(true);
    }
}
