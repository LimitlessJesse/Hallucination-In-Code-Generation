import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_5 {
    public static void main(String[] args) {
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(10, 10, 20, 20, 30, 30, 40, 40);
        double ctrlY2 = cubicCurve.getCtrlY2();
        System.out.println("Y-coordinate of the second control point: " + ctrlY2);
    }
}
