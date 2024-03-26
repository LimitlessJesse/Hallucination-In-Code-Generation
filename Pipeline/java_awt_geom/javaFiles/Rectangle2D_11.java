import java.awt.geom.Rectangle2D;

public class Rectangle2D_11 {
    public static void main(String[] args) {
        Rectangle2D rect1 = new Rectangle2D.Double(10, 10, 50, 50);
        Rectangle2D rect2 = new Rectangle2D.Double(20, 20, 30, 30);

        System.out.println(rect1.contains(rect2));
    }
}
