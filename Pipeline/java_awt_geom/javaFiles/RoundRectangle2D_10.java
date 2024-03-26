import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_10 {
    public static void main(String[] args) {
        RoundRectangle2D rect1 = new RoundRectangle2D.Double(10, 10, 50, 50, 10, 10);
        RoundRectangle2D rect2 = new RoundRectangle2D.Double(30, 30, 50, 50, 10, 10);

        boolean intersects = rect1.intersects(rect2.getX(), rect2.getY(), rect2.getWidth(), rect2.getHeight());

        System.out.println("Do the two rectangles intersect? " + intersects);
    }
}
