import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.RenderingHints;

public class Graphics2D_5 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setFont(new Font("Arial", Font.PLAIN, 14));
        g2d.setColor(Color.BLACK);
        g2d.drawString("Hello, World!", 10, 20);

        g2d.dispose();
    }
}
