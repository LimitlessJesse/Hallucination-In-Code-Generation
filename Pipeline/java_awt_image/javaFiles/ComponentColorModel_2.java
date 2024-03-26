import java.awt.image.ComponentColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class ComponentColorModel_2 {
    public static void main(String[] args) {
        ComponentColorModel colorModel = new ComponentColorModel(
                new int[]{8, 8, 8, 0}, // red, green, blue, alpha
                true, // has alpha
                false, // is opaque
                Transparency.OPAQUE,
                0);

        WritableRaster raster = colorModel.createCompatibleWritableRaster(10, 10);
        int pixel = raster.getPixel(0, 0, (int[]) null)[0];
        int blue = colorModel.getBlue(pixel);

        System.out.println("Blue component of the pixel: " + blue);
    }
}
