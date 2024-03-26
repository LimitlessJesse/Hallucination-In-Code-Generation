import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Float_5 {
    public static void main(String[] args) {
        QuadCurve2D.Float curve = new QuadCurve2D.Float(0, 0, 10, 10, 20, 20);
        float x2 = curve.getCtrlX2();
        System.out.println("X-coordinate of the control point: " + x2);
    }
}
