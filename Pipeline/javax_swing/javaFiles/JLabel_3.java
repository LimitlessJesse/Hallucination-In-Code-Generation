import javax.swing.*;
import java.awt.*;

public class JLabel_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        ImageIcon icon = new ImageIcon("path_to_your_image.jpg");
        JLabel label = new JLabel();
        label.setIcon(icon);

        frame.add(label);
        frame.setVisible(true);
    }
}
