import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class BorderFactory_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        // Create a line border with color red and thickness 5
        panel.setBorder(BorderFactory.createLineBorder(Color.RED, 5));

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
