import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_7 {
    public static void main(String[] args) {
        QuadCurve2D quadCurve = new QuadCurve2D.Double(0, 0, 10, 10, 20, 20);
        double y2 = quadCurve.getY2();
        System.out.println("Y2: " + y2);
    }
}
