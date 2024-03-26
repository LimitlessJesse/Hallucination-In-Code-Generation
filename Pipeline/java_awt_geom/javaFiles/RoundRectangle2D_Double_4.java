import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Double_4 {
    public static void main(String[] args) {
        RoundRectangle2D.Double rect = new RoundRectangle2D.Double(10, 10, 50, 50, 10, 10);
        double height = rect.getHeight();
        System.out.println("Height of the rectangle: " + height);
    }
}
