import javax.swing.JTabbedPane;

public class JTabbedPane_3 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", null);
        tabbedPane.addTab("Tab 2", null);
        tabbedPane.addTab("Tab 3", null);

        System.out.println("Before removing: " + tabbedPane.getTabCount());

        tabbedPane.remove(1); // Remove the second tab

        System.out.println("After removing: " + tabbedPane.getTabCount());
    }
}
