import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.Color;
import java.awt.Graphics;

public class MetalBorders_InternalFrameBorder_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                MetalBorders.InternalFrameBorder border = new MetalBorders.InternalFrameBorder();
                border.paintBorder(this, g, 0, 0, getWidth(), getHeight());
            }
        };
        panel.setBackground(Color.WHITE);
        frame.add(panel);
    }
}
