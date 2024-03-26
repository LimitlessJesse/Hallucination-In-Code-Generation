import java.awt.geom.Rectangle2D;

public class Rectangle2D_13 {
    public static void main(String[] args) {
        Rectangle2D rect = new Rectangle2D.Double(10, 10, 100, 100);
        boolean intersects = rect.intersectsLine(50, 50, 150, 150);
        System.out.println("Does the rectangle intersect the line? " + intersects);
    }
}
