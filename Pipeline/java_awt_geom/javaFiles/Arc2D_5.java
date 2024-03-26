import java.awt.geom.Arc2D;

public class Arc2D_5 {
    public static void main(String[] args) {
        Arc2D arc = new Arc2D.Double(10, 10, 100, 100, 0, 360, Arc2D.OPEN);
        boolean intersects = arc.intersects(50, 50, 100, 100);
        System.out.println("Does the rectangle intersect with the arc? " + intersects);
    }
}
