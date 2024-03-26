import javax.swing.*;
import java.awt.*;

public class JTabbedPane_29 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Panel 1"));
        tabbedPane.addTab("Tab 1", panel1);

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Panel 2"));
        tabbedPane.addTab("Tab 2", panel2);

        frame.getContentPane().add(tabbedPane);
        frame.setVisible(true);
    }
}
