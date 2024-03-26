import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_7 {
    public static void main(String[] args) {
        CubicCurve2D curve = new CubicCurve2D.Double(0, 0, 10, 10, 20, 0, 30, 10);
        double y1 = curve.getY1();
        System.out.println("Y-coordinate of the first control point: " + y1);
    }
}
