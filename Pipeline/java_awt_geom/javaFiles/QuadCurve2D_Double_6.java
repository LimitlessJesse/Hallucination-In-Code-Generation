import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_6 {
    public static void main(String[] args) {
        QuadCurve2D.Double quadCurve = new QuadCurve2D.Double(1, 2, 3, 4, 5, 6);
        double y2 = quadCurve.getY2();
        System.out.println("Y2: " + y2);
    }
}
