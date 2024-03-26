import javax.swing.JTabbedPane;

public class JTabbedPane_10 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", null);
        tabbedPane.addTab("Tab 2", null);
        tabbedPane.addTab("Tab 3", null);

        System.out.println("Is Tab 1 enabled? " + tabbedPane.isEnabledAt(0));
        System.out.println("Is Tab 2 enabled? " + tabbedPane.isEnabledAt(1));
        System.out.println("Is Tab 3 enabled? " + tabbedPane.isEnabledAt(2));
    }
}
