import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class ColorConvertOp_1 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        BufferedImage dst = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

        ColorConvertOp colorConvertOp = new ColorConvertOp(null, null, null);
        colorConvertOp.filter(src, dst);
    }
}
