import javax.swing.*;
import java.awt.event.*;

public class JCheckBoxMenuItem_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("Check me");
        checkBoxMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JCheckBoxMenuItem item = (JCheckBoxMenuItem)e.getSource();
                if (item.getState()) {
                    System.out.println("Checkbox is checked");
                } else {
                    System.out.println("Checkbox is unchecked");
                }
            }
        });

        JMenu menu = new JMenu("Menu");
        menu.add(checkBoxMenuItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
