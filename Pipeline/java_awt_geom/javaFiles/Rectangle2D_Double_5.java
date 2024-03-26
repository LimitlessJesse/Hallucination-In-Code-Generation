import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_5 {
    public static void main(String[] args) {
        Rectangle2D.Double rectangle = new Rectangle2D.Double(10, 20, 30, 40);
        double x = rectangle.getX();
        System.out.println("X coordinate of the rectangle: " + x);
    }
}
