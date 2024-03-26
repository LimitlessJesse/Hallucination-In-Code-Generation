import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Float_3 {
    public static void main(String[] args) {
        QuadCurve2D.Float curve = new QuadCurve2D.Float(0, 0, 10, 10, 20, 20);
        float x1 = curve.getCtrlX1();
        System.out.println("X-coordinate of the control point: " + x1);
    }
}
