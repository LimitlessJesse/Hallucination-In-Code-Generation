import javax.swing.*;
import java.awt.*;

public class JTabbedPane_23 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Panel 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Panel 2"));

        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);

        JPanel customPanel = new JPanel();
        customPanel.setBackground(Color.RED);
        customPanel.setPreferredSize(new Dimension(100, 100));

        tabbedPane.setTabComponentAt(1, customPanel);

        frame.getContentPane().add(tabbedPane);
        frame.pack();
        frame.setVisible(true);
    }
}
