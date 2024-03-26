import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Double_5 {
    public static void main(String[] args) {
        RoundRectangle2D.Double rect = new RoundRectangle2D.Double(10, 10, 50, 50, 10, 10);
        double width = rect.getWidth();
        System.out.println("Width of the rectangle: " + width);
    }
}
