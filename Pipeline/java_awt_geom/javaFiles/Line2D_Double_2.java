import java.awt.geom.Line2D;

public class Line2D_Double_2 {
    public static void main(String[] args) {
        Line2D.Double line = new Line2D.Double(1, 2, 3, 4);
        double y1 = line.getY1();
        System.out.println("Y-coordinate of the first endpoint of the line: " + y1);
    }
}
