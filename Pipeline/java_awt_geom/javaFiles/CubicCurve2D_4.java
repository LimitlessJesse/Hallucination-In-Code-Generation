import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_4 {
    public static void main(String[] args) {
        CubicCurve2D curve = new CubicCurve2D.Double(0, 0, 10, 10, 20, 0, 30, 10);
        double ctrlX2 = curve.getCtrlX2();
        System.out.println("The x-coordinate of the second control point is: " + ctrlX2);
    }
}
