import java.awt.geom.Arc2D;

public class Arc2D_Double_2 {
    public static void main(String[] args) {
        Arc2D.Double arc = new Arc2D.Double(10, 10, 100, 100, 0, 90, Arc2D.PIE);
        double x = arc.getX();
        System.out.println("X-coordinate of the center of the arc: " + x);
    }
}
