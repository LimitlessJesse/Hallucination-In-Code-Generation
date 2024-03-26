import javax.swing.*;
import java.awt.*;

public class ScrollPaneLayout_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JScrollPane scrollPane = new JScrollPane();
        JTextArea textArea = new JTextArea(10, 20);
        scrollPane.setViewportView(textArea);
        frame.add(scrollPane);
        frame.setSize(300, 300);
        frame.setVisible(true);

        ScrollPaneLayout layout = (ScrollPaneLayout) scrollPane.getLayout();
        Dimension preferredSize = layout.preferredLayoutSize(scrollPane);
        System.out.println("Preferred Layout Size: " + preferredSize);
    }
}
