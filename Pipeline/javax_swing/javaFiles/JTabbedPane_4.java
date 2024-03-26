import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTabbedPane_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Tab 1", null);
        tabbedPane.addTab("Tab 2", null);

        tabbedPane.setTitleAt(0, "New Title 1");
        tabbedPane.setTitleAt(1, "New Title 2");

        frame.add(tabbedPane);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
