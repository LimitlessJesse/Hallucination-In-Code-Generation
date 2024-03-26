import javax.swing.border.TitledBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class TitledBorder_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        TitledBorder border = new TitledBorder("My Title");
        panel.setBorder(border);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

        String title = border.getTitle();
        System.out.println("Title: " + title);
    }
}
