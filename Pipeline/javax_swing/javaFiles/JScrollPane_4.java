import javax.swing.*;
import java.awt.*;

public class JScrollPane_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scroll Pane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JScrollPane scrollPane = new JScrollPane();
        JLabel label = new JLabel("This is a label");
        scrollPane.setCorner(JScrollPane.UPPER_RIGHT_CORNER, label);

        frame.getContentPane().add(scrollPane);
        frame.setVisible(true);
    }
}
