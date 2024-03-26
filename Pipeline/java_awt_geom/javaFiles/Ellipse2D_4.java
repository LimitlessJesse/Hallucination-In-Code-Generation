import java.awt.geom.Ellipse2D;

public class Ellipse2D_4 {
    public static void main(String[] args) {
        Ellipse2D ellipse = new Ellipse2D.Double(5, 5, 10, 10);
        System.out.println(ellipse.contains(7, 7, 1, 1)); // true
        System.out.println(ellipse.contains(15, 15, 1, 1)); // false
    }
}
