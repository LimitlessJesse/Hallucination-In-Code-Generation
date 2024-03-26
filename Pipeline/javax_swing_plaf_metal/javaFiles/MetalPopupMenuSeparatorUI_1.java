import javax.swing.*;
import javax.swing.plaf.metal.MetalPopupMenuSeparatorUI;
import java.awt.*;

public class MetalPopupMenuSeparatorUI_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                MetalPopupMenuSeparatorUI ui = new MetalPopupMenuSeparatorUI();
                ui.paint(g, this);
            }
        };
        JFrame frame = new JFrame();
        frame.add(component);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
