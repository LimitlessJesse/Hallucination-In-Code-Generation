import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class FontMetrics_4 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Font font = new Font("Arial", Font.PLAIN, 12);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Graphics g = ge.getDefaultScreenDevice().getDefaultConfiguration().createCompatibleGraphics(null);
        FontMetrics fm = g.getFontMetrics(font);
        int width = fm.stringWidth(text);
        System.out.println("The width of the string is: " + width);
    }
}
