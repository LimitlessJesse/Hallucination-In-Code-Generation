import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_4 {
    public static void main(String[] args) {
        QuadCurve2D quadCurve = new QuadCurve2D.Double(0, 0, 100, 100, 200, 0);
        double x1 = quadCurve.getCtrlX1();
        System.out.println("X-coordinate of the control point: " + x1);
    }
}
