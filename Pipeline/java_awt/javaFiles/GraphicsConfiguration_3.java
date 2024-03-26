import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Transparency;
import java.awt.image.ColorModel;

public class GraphicsConfiguration_3 {
    public static void main(String[] args) {
        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        ColorModel cm = gc.getColorModel();
        int trans = cm.getTransparency();
        System.out.println("Color Model: " + cm);
        System.out.println("Transparency: " + (trans == Transparency.OPAQUE? "OPAQUE" : trans == Transparency.BITMASK? "BITMASK" : "TRANSLUCENT"));
    }
}
