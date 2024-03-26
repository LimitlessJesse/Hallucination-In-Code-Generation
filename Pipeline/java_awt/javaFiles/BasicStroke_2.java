import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Line2D;

public class BasicStroke_2 {
    public static void main(String[] args) {
        BasicStroke stroke = new BasicStroke(5.0f);
        Graphics2D g2d = null;
        Shape shape = new Line2D.Float(0, 0, 100, 100);
        float lineWidth = stroke.createStrokedShape(shape).getLineWidth();
        System.out.println("Line Width: " + lineWidth);
    }
}
