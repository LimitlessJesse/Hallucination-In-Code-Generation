import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_6 {
    public static void main(String[] args) {
        Rectangle2D.Double rectangle = new Rectangle2D.Double(10, 20, 30, 40);
        double y = rectangle.getY();
        System.out.println("Y-coordinate of the upper-left corner of the rectangle: " + y);
    }
}
