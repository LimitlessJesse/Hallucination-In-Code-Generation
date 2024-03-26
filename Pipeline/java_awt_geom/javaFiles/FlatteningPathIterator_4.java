import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.Path2D;

public class FlatteningPathIterator_4 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Float();
        path.moveTo(10, 10);
        path.lineTo(100, 10);
        path.lineTo(100, 100);
        path.closePath();

        FlatteningPathIterator iterator = new FlatteningPathIterator(path.getPathIterator(null));
        int windingRule = iterator.getWindingRule();

        System.out.println("Winding rule: " + windingRule);
    }
}
