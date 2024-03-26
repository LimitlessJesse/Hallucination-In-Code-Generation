import javax.swing.*;
import java.awt.*;

public class GroupLayout_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GroupLayout(panel));

        JButton button = new JButton("Button");
        panel.addLayoutComponent(button, "Button");

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
