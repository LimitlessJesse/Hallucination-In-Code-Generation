import javax.swing.*;
import javax.swing.plaf.metal.MetalTabbedPaneUI;
import java.awt.*;

public class JTabbedPane_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Create a tab with a custom icon
        ImageIcon icon = new ImageIcon("path_to_your_icon.png");
        tabbedPane.setIconAt(0, icon);

        // Add the tabbed pane to the frame
        frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

        // Add tabs
        tabbedPane.addTab("Tab 1", new JLabel("Content 1"));
        tabbedPane.addTab("Tab 2", new JLabel("Content 2"));

        frame.pack();
        frame.setVisible(true);
    }
}
