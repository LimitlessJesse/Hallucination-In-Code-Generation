import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_2 {
    public static void main(String[] args) {
        CubicCurve2D curve = new CubicCurve2D.Double(0, 0, 10, 10, 20, 0, 30, 10);
        double ctrlX1 = curve.getCtrlX1();
        System.out.println("X-coordinate of the first control point: " + ctrlX1);
    }
}
