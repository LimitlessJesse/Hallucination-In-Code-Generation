import java.awt.geom.Point2D;

public class Point2D_3 {
    public static void main(String[] args) {
        double x1 = 1.0;
        double y1 = 2.0;
        double x2 = 4.0;
        double y2 = 6.0;

        double distance = Point2D.distanceSq(x1, y1, x2, y2);

        System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);
    }
}
