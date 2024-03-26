import java.awt.geom.Rectangle2D;

public class Rectangle2D_9 {
    public static void main(String[] args) {
        Rectangle2D rect1 = new Rectangle2D.Double(10, 10, 100, 100);
        Rectangle2D rect2 = new Rectangle2D.Double(50, 50, 100, 100);

        boolean intersects = rect1.intersects(50, 50, 100, 100);
        System.out.println("Do the rectangles intersect? " + intersects);
    }
}
