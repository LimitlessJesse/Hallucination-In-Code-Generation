import java.awt.geom.Dimension2D;
import java.awt.geom.Rectangle2D;

public class Dimension2D_1 {
    public static void main(String[] args) {
        Dimension2D dimension = new Rectangle2D.Double(10, 20, 30, 40);
        System.out.println("Height: " + dimension.getHeight());
    }
}
