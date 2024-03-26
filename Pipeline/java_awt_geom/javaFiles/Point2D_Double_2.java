import java.awt.geom.Point2D;

public class Point2D_Double_2 {
    public static void main(String[] args) {
        Point2D.Double point = new Point2D.Double(3, 4);
        double y = point.getY();
        System.out.println("Y-coordinate of the point is: " + y);
    }
}
