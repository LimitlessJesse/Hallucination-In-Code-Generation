import java.awt.BasicStroke;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class BasicStroke_5 {
    public static void main(String[] args) {
        Shape ellipse = new Ellipse2D.Double(5, 5, 100, 100);
        BasicStroke stroke = new BasicStroke(5);
        Shape strokedEllipse = stroke.createStrokedShape(ellipse);
        System.out.println(strokedEllipse);
    }
}
