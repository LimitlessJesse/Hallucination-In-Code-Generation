import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_3 {
    public static void main(String[] args) {
        QuadCurve2D quadCurve = new QuadCurve2D.Double(0, 0, 10, 10, 20, 20);
        double ctrlY = quadCurve.getCtrlY();
        System.out.println("Y-coordinate of the control point: " + ctrlY);
    }
}
