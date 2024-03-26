import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;

public class GraphicsConfiguration_2 {
    public static void main(String[] args) {
        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        Rectangle bounds = gc.getBounds();
        System.out.println("X: " + bounds.x + ", Y: " + bounds.y + ", Width: " + bounds.width + ", Height: " + bounds.height);
    }
}
