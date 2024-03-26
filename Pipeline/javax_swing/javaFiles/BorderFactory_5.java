import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class BorderFactory_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createSoftBevelBorder(1, Color.RED, Color.BLUE));

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
