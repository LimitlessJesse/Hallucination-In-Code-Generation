import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class ColorModel_3 {
    public static void main(String[] args) {
        ColorModel cm = ColorModel.getRGBdefault();
        int pixel = cm.getRGB(0, 0, 0, null);
        int green = cm.getGreen(pixel);
        System.out.println("Green value: " + green);
    }
}
