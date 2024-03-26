import java.awt.Shape;
import java.awt.geom.FlatteningPathIterator;

public class FlatteningPathIterator_3 {
    public static void main(String[] args) {
        Shape shape = new java.awt.geom.Rectangle2D.Float(10, 10, 50, 50);
        FlatteningPathIterator iterator = new FlatteningPathIterator(shape.getPathIterator(null));

        float[] coords = new float[6];
        int type = iterator.currentSegment(coords);

        System.out.println("Type: " + type);
        System.out.println("Coordinates: ");
        for (float coord : coords) {
            System.out.println(coord);
        }
    }
}
