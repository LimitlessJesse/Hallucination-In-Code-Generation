import java.awt.geom.Arc2D;

public class Arc2D_3 {
    public static void main(String[] args) {
        Arc2D arc = new Arc2D.Double(0, 0, 100, 100, 0, 360, Arc2D.OPEN);
        boolean contains = arc.contains(50, 50);
        System.out.println(contains);
    }
}
