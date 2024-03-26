import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_2 {
    public static void main(String[] args) {
        RoundRectangle2D roundRectangle = new RoundRectangle2D.Double(10, 10, 100, 100, 20, 20);
        double arcWidth = roundRectangle.getArcWidth();
        System.out.println("Arc Width: " + arcWidth);
    }
}
