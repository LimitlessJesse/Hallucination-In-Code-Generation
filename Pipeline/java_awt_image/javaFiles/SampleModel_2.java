import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;

public class SampleModel_2 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = image.getRaster();
        SampleModel sm = raster.getSampleModel();
        int numBands = sm.getNumBands();
        System.out.println("Number of bands: " + numBands);
    }
}
