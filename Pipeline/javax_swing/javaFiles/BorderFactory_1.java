import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class BorderFactory_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
