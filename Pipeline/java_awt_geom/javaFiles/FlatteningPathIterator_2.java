import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.Path2D;

public class FlatteningPathIterator_2 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Float();
        path.moveTo(10, 10);
        path.lineTo(20, 20);
        path.lineTo(30, 10);

        FlatteningPathIterator iterator = new FlatteningPathIterator(path.getPathIterator(null));

        while (!iterator.isDone()) {
            iterator.next();
            // do something with the current point
        }
    }
}
