import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Line2D;

public class BasicStroke_3 {
    public static void main(String[] args) {
        BasicStroke stroke = new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 10.0f, new float[]{10.0f}, 0);
        Graphics2D g2d = null;
        Shape shape = new Line2D.Float(10, 10, 100, 100);
        g2d.setStroke(stroke);
        int endCap = stroke.getEndCap();
        System.out.println("End cap style: " + endCap);
    }
}
