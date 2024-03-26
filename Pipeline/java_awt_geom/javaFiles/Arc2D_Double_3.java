import java.awt.geom.Arc2D;

public class Arc2D_Double_3 {
    public static void main(String[] args) {
        Arc2D.Double arc = new Arc2D.Double(0, 0, 100, 100, 0, 90, Arc2D.PIE);
        double y = arc.getY();
        System.out.println("Y-coordinate of the center of the arc: " + y);
    }
}
