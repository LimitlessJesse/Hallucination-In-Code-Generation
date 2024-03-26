import javax.swing.*;

public class JTabbedPane_6 {
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

        frame.getContentPane().add(tabbedPane);
        frame.pack();
        frame.setVisible(true);

        // Set the second tab as selected
        tabbedPane.setSelectedIndex(1);
    }
}
