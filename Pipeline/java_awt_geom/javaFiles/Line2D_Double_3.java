import java.awt.geom.Line2D;

public class Line2D_Double_3 {
    public static void main(String[] args) {
        Line2D.Double line = new Line2D.Double(1, 2, 3, 4);
        double x2 = line.getX2();
        System.out.println("The x-coordinate of the second endpoint is: " + x2);
    }
}
