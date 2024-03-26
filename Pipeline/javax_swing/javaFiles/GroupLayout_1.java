import javax.swing.*;
import java.awt.*;

public class GroupLayout_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GroupLayout(panel));

        JButton button = new JButton("Click me");
        panel.addLayoutComponent("Button", button);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
