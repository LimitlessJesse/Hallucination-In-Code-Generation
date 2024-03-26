import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class BufferedImage_4 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        ColorModel colorModel = image.getColorModel();
        System.out.println(colorModel);
    }
}
