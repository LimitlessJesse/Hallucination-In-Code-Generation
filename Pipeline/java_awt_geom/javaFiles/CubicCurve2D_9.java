import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_9 {
    public static void main(String[] args) {
        CubicCurve2D cubicCurve = new CubicCurve2D.Double(10, 10, 20, 20, 30, 30, 40, 40);
        double y2 = cubicCurve.getY2();
        System.out.println("Y2: " + y2);
    }
}
