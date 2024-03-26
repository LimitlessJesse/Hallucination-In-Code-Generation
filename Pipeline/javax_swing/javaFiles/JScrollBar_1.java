import javax.swing.JScrollBar;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.Dimension;

public class JScrollBar_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(300, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setPreferredSize(new Dimension(100, 100));
        scrollBar.setValue(50);

        JScrollPane scrollPane = new JScrollPane(scrollBar);
        frame.getContentPane().add(scrollPane);

        frame.setVisible(true);

        int value = scrollBar.getValue();
        System.out.println("Value of scrollbar: " + value);
    }
}
