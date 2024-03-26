import javax.swing.border.TitledBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class TitledBorder_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Titled Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        TitledBorder border = new TitledBorder("This is a Titled Border");
        border.setTitle("New Title");
        panel.setBorder(border);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
