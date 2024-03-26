import java.awt.geom.Point2D;

public class Point2D_10 {
    public static void main(String[] args) {
        Point2D point = new Point2D.Double();
        point.setLocation(10, 20);
        System.out.println("X: " + point.getX() + ", Y: " + point.getY());
    }
}
