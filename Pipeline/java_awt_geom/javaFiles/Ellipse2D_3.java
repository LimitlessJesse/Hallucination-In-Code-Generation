import java.awt.geom.Ellipse2D;

public class Ellipse2D_3 {
    public static void main(String[] args) {
        Ellipse2D ellipse = new Ellipse2D.Double(5, 5, 10, 10);
        double x = 7;
        double y = 7;
        boolean isInside = ellipse.contains(x, y);
        System.out.println("Is point (" + x + ", " + y + ") inside the ellipse? " + isInside);
    }
}
