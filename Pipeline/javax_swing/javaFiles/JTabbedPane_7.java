import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class JTabbedPane_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1 = new JPanel();
        panel1.add("This is panel 1");
        tabbedPane.addTab("Tab 1", panel1);

        JPanel panel2 = new JPanel();
        panel2.add("This is panel 2");
        tabbedPane.addTab("Tab 2", panel2);

        frame.getContentPane().add(tabbedPane);
        frame.pack();
        frame.setVisible(true);

        int selectedIndex = tabbedPane.getSelectedIndex();
        System.out.println("Selected index: " + selectedIndex);
    }
}
