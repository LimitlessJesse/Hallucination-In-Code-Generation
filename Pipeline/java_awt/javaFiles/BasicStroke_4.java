import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class BasicStroke_4 {
    public static void main(String[] args) {
        BasicStroke stroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{10.0f}, 0);
        int lineJoin = stroke.getLineJoin();
        System.out.println("Line join style: " + lineJoin);
    }
}
