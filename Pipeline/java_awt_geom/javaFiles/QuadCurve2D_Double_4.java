import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_4 {
    public static void main(String[] args) {
        QuadCurve2D.Double quadCurve = new QuadCurve2D.Double(10, 10, 20, 20, 30, 30);
        double y1 = quadCurve.getY1();
        System.out.println("Y1: " + y1);
    }
}
