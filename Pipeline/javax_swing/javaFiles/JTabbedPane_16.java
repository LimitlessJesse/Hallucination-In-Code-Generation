import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class JTabbedPane_16 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        int policy = tabbedPane.getTabLayoutPolicy();
        System.out.println("Tab Layout Policy: " + policy);
    }
}
