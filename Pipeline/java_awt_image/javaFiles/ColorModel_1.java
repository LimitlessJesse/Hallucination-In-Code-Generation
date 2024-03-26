import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class ColorModel_1 {
    public static void main(String[] args) {
        ColorModel colorModel = ColorModel.getRGBdefault();
        int pixel = colorModel.getAlpha(0xFF000000);
        System.out.println(pixel);
    }
}
