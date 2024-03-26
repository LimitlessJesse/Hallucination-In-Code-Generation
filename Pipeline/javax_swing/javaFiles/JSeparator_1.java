import javax.swing.JFrame;
import javax.swing.JSeparator;
import java.awt.BorderLayout;

public class JSeparator_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Separator Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSeparator separator = new JSeparator(JSeparator.HORIZONTAL);
        frame.add(separator, BorderLayout.NORTH);

        separator.setOrientation(JSeparator.VERTICAL);

        frame.setVisible(true);
    }
}
