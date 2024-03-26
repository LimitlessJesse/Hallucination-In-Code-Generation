import javax.swing.*;
import javax.swing.plaf.multi.MultiSeparatorUI;
import java.awt.*;

public class MultiSeparatorUI_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            public void updateUI() {
                setUI(new MultiSeparatorUI() {
                    @Override
                    public void paint(Graphics g, JComponent c) {
                        // Your custom painting code here
                    }
                });
                super.updateUI();
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
