import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_5 {
    public static void main(String[] args) {
        CubicCurve2D cubicCurve = new CubicCurve2D.Double(0, 0, 10, 10, 20, 0, 30, 10);
        double ctrlY2 = cubicCurve.getCtrlY2();
        System.out.println("Y-coordinate of the second control point: " + ctrlY2);
    }
}
