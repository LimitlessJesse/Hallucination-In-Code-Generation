import javax.swing.*;
import javax.swing.plaf.LayerUI;
import java.awt.*;

public class LayerUI_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString("Hello, World!", 10, 20);
            }
        };

        LayerUI<JComponent> layerUI = new LayerUI<JComponent>() {
            @Override
            public void paint(Graphics g, JComponent c) {
                super.paint(g, c);
                g.setColor(Color.RED);
                g.drawRect(10, 10, 100, 100);
            }
        };

        panel.setUI(layerUI);

        frame.add(panel);
        frame.setVisible(true);
    }
}
