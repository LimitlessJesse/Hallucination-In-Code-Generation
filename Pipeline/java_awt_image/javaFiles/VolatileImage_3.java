import java.awt.Graphics2D;
import java.awt.image.VolatileImage;

public class VolatileImage_3 {
    public static void main(String[] args) {
        VolatileImage vi = VolatileImage.createVolatileImage(100, 100, VolatileImage.TRANSLUCENT, null);
        Graphics2D g2d = vi.createGraphics();
        // Now you can use g2d to draw on the VolatileImage
        g2d.dispose();
    }
}
