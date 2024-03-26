import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class ColorModel_2 {
    public static void main(String[] args) {
        ColorModel cm = ColorModel.getRGBdefault();
        int pixel = cm.getBlue(0xFF0000);
        System.out.println(pixel);
    }
}
