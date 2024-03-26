import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class ColorModel_5 {
    public static void main(String[] args) {
        ColorModel colorModel = ColorModel.getRGBdefault();
        int transparency = colorModel.getTransparency();
        System.out.println("Transparency: " + transparency);
    }
}
