import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.metal.MetalBorders.PaletteBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class MetalBorders_PaletteBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                PaletteBorder border = new PaletteBorder(Color.BLACK, 10, 10, 10, 10);
                border.paintBorder(this, g, 0, 0, getWidth(), getHeight());
            }
        };

        frame.add(panel);
    }
}
