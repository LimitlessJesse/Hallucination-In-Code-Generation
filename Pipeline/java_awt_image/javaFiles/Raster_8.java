import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class Raster_8 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = image.getRaster();

        int sample = raster.getSample(0, 50, 50);
        System.out.println("Sample: " + sample);
    }
}
