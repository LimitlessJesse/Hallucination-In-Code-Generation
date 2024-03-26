import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Float_4 {
    public static void main(String[] args) {
        QuadCurve2D.Float curve = new QuadCurve2D.Float(0, 0, 10, 10, 20, 20);
        float y1 = curve.getY1();
        System.out.println("Y1: " + y1);
    }
}
