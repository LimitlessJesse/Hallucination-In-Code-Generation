import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_2 {
    public static void main(String[] args) {
        QuadCurve2D quadCurve = new QuadCurve2D.Double(0, 0, 10, 10, 20, 0);
        double ctrlX = quadCurve.getCtrlX();
        System.out.println("Control Point X: " + ctrlX);
    }
}
