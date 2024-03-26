import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Double_7 {
    public static void main(String[] args) {
        RoundRectangle2D.Double rect = new RoundRectangle2D.Double(10, 20, 30, 40, 5, 6);
        double y = rect.getY();
        System.out.println("Y-coordinate of the upper-left corner of the rectangle: " + y);
    }
}
