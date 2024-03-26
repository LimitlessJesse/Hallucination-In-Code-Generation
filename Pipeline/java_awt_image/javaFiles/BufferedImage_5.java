import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class BufferedImage_5 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = image.getRaster();

        // Now you can use the raster to get and set pixel values
        // For example, to set the pixel at (0, 0) to red:
        raster.setPixel(0, 0, new int[]{255, 0, 0});

        // And to get the pixel at (0, 0):
        int[] pixel = new int[3];
        raster.getPixel(0, 0, pixel);
        System.out.println("Pixel at (0, 0) is: " + pixel[0] + ", " + pixel[1] + ", " + pixel[2]);
    }
}
