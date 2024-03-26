import java.awt.image.ComponentColorModel;
import java.awt.image.RGBImageFilter;

public class ComponentColorModel_4 {
    public static void main(String[] args) {
        ComponentColorModel colorModel = new ComponentColorModel(new RGBImageFilter(), true, true, Transparency.OPAQUE, 0);
        int pixel = 0xFF0000; // Red color
        int red = colorModel.getRed(pixel);
        System.out.println("Red component: " + red);
    }
}
