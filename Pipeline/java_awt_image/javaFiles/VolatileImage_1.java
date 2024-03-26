import java.awt.GraphicsEnvironment;
import java.awt.GraphicsConfiguration;
import java.awt.Transparency;
import java.awt.image.VolatileImage;

public class VolatileImage_1 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsConfiguration gc = ge.getDefaultScreenDevice().getDefaultConfiguration();
        VolatileImage vi = gc.createCompatibleVolatileImage(100, 100, Transparency.OPAQUE);
        int width = vi.getWidth();
        System.out.println("Width of VolatileImage: " + width);
    }
}
