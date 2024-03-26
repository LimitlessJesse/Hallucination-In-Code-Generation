import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.JTextArea;

public class JViewport_47 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scroll Mode Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(20, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JViewport viewport = scrollPane.getViewport();
        viewport.setScrollMode(JViewport.SIMPLE_SCROLL);

        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}
