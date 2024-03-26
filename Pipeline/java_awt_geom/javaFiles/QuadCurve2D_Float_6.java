import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Float_6 {
    public static void main(String[] args) {
        QuadCurve2D.Float curve = new QuadCurve2D.Float(0, 0, 10, 10, 20, 20);
        double y2 = curve.getY2();
        System.out.println("Y2: " + y2);
    }
}
