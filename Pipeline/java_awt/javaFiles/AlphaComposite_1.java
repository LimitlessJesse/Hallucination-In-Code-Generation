import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class AlphaComposite_1 {
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("input.jpg"));
            BufferedImage overlay = ImageIO.read(new File("overlay.jpg"));

            Graphics2D g2d = image.createGraphics();
            Composite originalComposite = g2d.getComposite();

            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
            g2d.drawImage(overlay, null, 0, 0);

            g2d.setComposite(originalComposite);
            g2d.dispose();

            ImageIO.write(image, "jpg", new File("output.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
