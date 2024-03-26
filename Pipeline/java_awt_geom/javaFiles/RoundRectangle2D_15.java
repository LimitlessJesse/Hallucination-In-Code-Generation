import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_15 {
    public static void main(String[] args) {
        RoundRectangle2D rect1 = new RoundRectangle2D.Double(10, 10, 50, 50, 10, 10);
        RoundRectangle2D rect2 = new RoundRectangle2D.Double(20, 20, 50, 50, 10, 10);

        System.out.println(rect1.contains(rect2.getX(), rect2.getY(), rect2.getWidth(), rect2.getHeight()));
    }
}
