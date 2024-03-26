import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class FontMetrics_3 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Graphics g = ge.getDefaultScreenDevice().getDefaultConfiguration().createCompatibleGraphics(null);
        Font font = new Font("Arial", Font.PLAIN, 12);
        g.setFont(font);
        FontMetrics fm = g.getFontMetrics();
        int height = fm.getHeight();
        System.out.println("Height of the font in pixels: " + height);
    }
}
