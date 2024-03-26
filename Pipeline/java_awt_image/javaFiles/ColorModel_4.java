import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class ColorModel_4 {
    public static void main(String[] args) {
        ColorModel cm = ColorModel.getRGBdefault();
        WritableRaster raster = cm.createCompatibleWritableRaster(10, 10);
        int pixel = raster.getSample(0, 0, 0);
        int red = cm.getRed(pixel);
        System.out.println("Red component of pixel: " + red);
    }
}
