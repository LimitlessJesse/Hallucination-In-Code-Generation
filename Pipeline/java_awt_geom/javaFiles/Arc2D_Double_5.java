import java.awt.geom.Arc2D;

public class Arc2D_Double_5 {
    public static void main(String[] args) {
        Arc2D.Double arc = new Arc2D.Double(0, 0, 100, 100, 0, 90, Arc2D.PIE);
        double height = arc.getHeight();
        System.out.println("Height of the arc: " + height);
    }
}
