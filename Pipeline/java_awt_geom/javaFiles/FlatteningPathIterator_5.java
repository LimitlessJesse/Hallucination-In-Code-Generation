import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.Path2D;

public class FlatteningPathIterator_5 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Float();
        path.moveTo(10, 10);
        path.lineTo(20, 20);
        FlatteningPathIterator iterator = new FlatteningPathIterator(path.getPathIterator(null));

        while (!iterator.isDone()) {
            iterator.next();
            System.out.println("isDone: " + iterator.isDone());
        }
    }
}
