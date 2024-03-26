import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Transparency;

public class GraphicsConfiguration_4 {
    public static void main(String[] args) {
        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        System.out.println(gc.getColorModel(Transparency.OPAQUE));
    }
}
