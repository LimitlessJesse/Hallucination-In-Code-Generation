import java.awt.image.BufferedImage;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBufferInt;

public class ComponentColorModel_5 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        ComponentColorModel colorModel = (ComponentColorModel) image.getColorModel();

        int pixel = image.getRGB(0, 0);
        int red = colorModel.getRed(pixel);
        int green = colorModel.getGreen(pixel);
        int blue = colorModel.getBlue(pixel);

        System.out.println("Red: " + red);
        System.out.println("Green: " + green);
        System.out.println("Blue: " + blue);
    }
}
