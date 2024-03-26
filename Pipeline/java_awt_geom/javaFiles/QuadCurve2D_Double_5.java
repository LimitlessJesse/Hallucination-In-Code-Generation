import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_5 {
    public static void main(String[] args) {
        QuadCurve2D.Double curve = new QuadCurve2D.Double(0, 0, 10, 10, 20, 20);
        double x2 = curve.getX2();
        System.out.println("X2: " + x2);
    }
}
