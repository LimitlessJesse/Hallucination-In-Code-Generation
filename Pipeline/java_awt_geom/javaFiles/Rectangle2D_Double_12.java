import java.awt.geom.Rectangle2D;

public class Rectangle2D_Double_12 {
    public static void main(String[] args) {
        Rectangle2D.Double rect = new Rectangle2D.Double();
        rect.setRect(10, 10, 50, 50);
        System.out.println("X: " + rect.getX());
        System.out.println("Y: " + rect.getY());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
    }
}
