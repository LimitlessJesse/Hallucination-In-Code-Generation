import java.awt.geom.Point2D;

public class Point2D_Float_3 {
    public static void main(String[] args) {
        Point2D.Float point = new Point2D.Float();
        point.setLocation(5.0f, 10.0f);
        System.out.println("X: " + point.x + ", Y: " + point.y);
    }
}
