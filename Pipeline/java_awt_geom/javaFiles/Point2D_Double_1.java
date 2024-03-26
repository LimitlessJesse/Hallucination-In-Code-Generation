import java.awt.geom.Point2D;

public class Point2D_Double_1 {
    public static void main(String[] args) {
        Point2D.Double point = new Point2D.Double(3.0, 4.0);
        double x = point.getX();
        System.out.println("The x-coordinate of the point is: " + x);
    }
}
