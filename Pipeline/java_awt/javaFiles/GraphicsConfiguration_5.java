import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Transparency;
import java.awt.image.BufferedImage;

public class GraphicsConfiguration_5 {
    public static void main(String[] args) {
        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        BufferedImage image = gc.createCompatibleImage(100, 100, Transparency.OPAQUE);
        // Now you can use the image as you need
    }
}
