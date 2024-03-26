import java.awt.geom.Rectangle2D;

public class Rectangle2D_7 {
    public static void main(String[] args) {
        Rectangle2D rect = new Rectangle2D.Double(10, 10, 50, 50);
        double x = 30, y = 30;
        boolean contains = rect.contains(x, y);
        System.out.println("The point (" + x + ", " + y + ") is " + (contains? "" : "not ") + "contained in the rectangle.");
    }
}
