import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_6 {
    public static void main(String[] args) {
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(10, 10, 20, 20, 30, 30, 40, 40);
        double x1 = cubicCurve.getX1();
        System.out.println("X-coordinate of the first control point: " + x1);
    }
}
