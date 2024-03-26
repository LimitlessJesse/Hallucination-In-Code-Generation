import java.awt.image.ComponentColorModel;
import java.awt.image.RGBImageFilter;

public class ComponentColorModel_3 {
    public static void main(String[] args) {
        ComponentColorModel model = new ComponentColorModel(new RGBImageFilter(), true, true, Transparency.OPAQUE, 0);
        int pixel = model.getRGB(0, 0);
        int green = model.getGreen(pixel);
        System.out.println("Green component: " + green);
    }
}
