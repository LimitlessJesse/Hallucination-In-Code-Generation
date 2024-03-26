import java.awt.geom.Arc2D;

public class Arc2D_Double_4 {
    public static void main(String[] args) {
        Arc2D.Double arc = new Arc2D.Double(0, 0, 100, 100, 0, 90, Arc2D.PIE);
        double width = arc.getWidth();
        System.out.println("Width of the arc: " + width);
    }
}
