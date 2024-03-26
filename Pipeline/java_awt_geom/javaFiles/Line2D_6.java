import java.awt.geom.Line2D;

public class Line2D_6 {
    public static void main(String[] args) {
        Line2D line = new Line2D.Double(1, 2, 3, 4);
        double y2 = line.getY2();
        System.out.println("Y2: " + y2);
    }
}
