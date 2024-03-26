import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_8 {
    public static void main(String[] args) {
        RoundRectangle2D rect = new RoundRectangle2D.Double(10, 10, 100, 100, 10, 10);
        System.out.println(rect.contains(50, 50));  // true
        System.out.println(rect.contains(150, 150));  // false
    }
}
