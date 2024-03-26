import java.awt.image.Raster;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class Raster_2 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = image.getRaster();
        int numDataElements = raster.getNumDataElements();
        System.out.println("Number of data elements: " + numDataElements);
    }
}
