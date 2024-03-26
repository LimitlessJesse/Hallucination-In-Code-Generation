import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class RectangularShape_6 {
    public static void main(String[] args) {
        RectangularShape shape1 = new Rectangle2D.Double(10, 10, 50, 50);
        RectangularShape shape2 = new Rectangle2D.Double(30, 30, 50, 50);

        boolean intersects = shape1.intersects(shape2.getBounds2D());

        System.out.println("Do the shapes intersect? " + intersects);
    }
}
