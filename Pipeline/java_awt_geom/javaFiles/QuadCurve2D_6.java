import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_6 {
    public static void main(String[] args) {
        QuadCurve2D quadCurve = new QuadCurve2D.Double(0, 0, 10, 10, 20, 0);
        double x2 = quadCurve.getCtrlX2();
        System.out.println("X-coordinate of the control point: " + x2);
    }
}
