import java.awt.image.BufferedImage;
import java.awt.image.Raster;

public class Raster_1 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Raster raster = image.getRaster();
        int numBands = raster.getNumBands();
        System.out.println("Number of bands: " + numBands);
    }
}
