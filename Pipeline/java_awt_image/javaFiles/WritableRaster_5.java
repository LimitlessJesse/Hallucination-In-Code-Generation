import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class WritableRaster_5 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = image.getRaster();

        // Set a sample at (50, 50) with band 0 to 100
        raster.setSample(50, 50, 0, 100);
    }
}
