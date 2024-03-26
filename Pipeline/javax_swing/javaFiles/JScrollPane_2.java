import javax.swing.*;
import java.awt.*;

public class JScrollPane_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextArea textArea = new JTextArea(10, 20);
        textArea.setText("This is a JTextArea inside a JScrollPane.");

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
