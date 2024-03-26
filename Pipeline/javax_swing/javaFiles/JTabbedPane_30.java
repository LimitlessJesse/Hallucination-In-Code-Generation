import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class JTabbedPane_30 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("Tab 1", new JPanel());
        tabbedPane.add("Tab 2", new JPanel());

        int tabPlacement = tabbedPane.getTabPlacement();
        System.out.println("Tab Placement: " + tabPlacement);

        frame.getContentPane().add(tabbedPane);
        frame.pack();
        frame.setVisible(true);
    }
}
