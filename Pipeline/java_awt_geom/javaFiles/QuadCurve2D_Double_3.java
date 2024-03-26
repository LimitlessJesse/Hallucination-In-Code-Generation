import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_3 {
    public static void main(String[] args) {
        QuadCurve2D.Double quadCurve = new QuadCurve2D.Double(10, 10, 20, 20, 30, 30);
        double x1 = quadCurve.getX1();
        System.out.println("X-coordinate of the control point: " + x1);
    }
}
