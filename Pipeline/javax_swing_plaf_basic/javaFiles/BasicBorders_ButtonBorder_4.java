import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class BasicBorders_ButtonBorder_4 {
    public static void main(String[] args) {
        JButton button = new JButton("Button");
        button.setBorder(new BasicBorders.ButtonBorder());
        button.setBounds(100, 100, 100, 50);

        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setVisible(true);
    }
}
