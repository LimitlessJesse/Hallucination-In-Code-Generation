import java.awt.geom.RoundRectangle2D;

public class RoundRectangle2D_Float_4 {
    public static void main(String[] args) {
        RoundRectangle2D.Float rect = new RoundRectangle2D.Float();
        rect.setRoundRect(10, 10, 50, 50, 10, 10);
        System.out.println(rect);
    }
}
