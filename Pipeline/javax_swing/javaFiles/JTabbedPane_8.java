import javax.swing.*;
import java.awt.*;

public class JTabbedPane_8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Panel 1"));
        tabbedPane.addTab("Tab 1", panel1);

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Panel 2"));
        tabbedPane.addTab("Tab 2", panel2);

        frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);

        // Select the second tab
        tabbedPane.setSelectedIndex(1);

        // Get the selected component
        Component selectedComponent = tabbedPane.getSelectedComponent();

        // Print the class name of the selected component
        System.out.println("Selected component: " + selectedComponent.getClass().getName());
    }
}
