import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_8 {
    public static void main(String[] args) {
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(1, 2, 3, 4, 5, 6, 7, 8);
        double x2 = cubicCurve.getX2();
        System.out.println("X2: " + x2);
    }
}
