import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class RectangularShape_3 {
    public static void main(String[] args) {
        RectangularShape shape = new RectangularShape() {
            @Override
            public Rectangle2D getBounds2D() {
                return new Rectangle2D.Double(0, 0, 10, 10);
            }

            @Override
            public Rectangle2D getBounds() {
                return getBounds2D();
            }

            @Override
            public Rectangle2D getBounds(Rectangle2D r) {
                return getBounds2D();
            }

            @Override
            public boolean contains(double x, double y) {
                return false;
            }

            @Override
            public boolean contains(Rectangle2D r) {
                return false;
            }

            @Override
            public boolean intersects(double x, double y, double w, double h) {
                return false;
            }

            @Override
            public boolean intersects(Rectangle2D r) {
                return false;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public void setFrame(double x, double y, double w, double h) {

            }

            @Override
            public double getWidth() {
                return 0;
            }

            @Override
            public double getHeight() {
                return 0;
            }

            @Override
            public double getX() {
                return 0;
            }

            @Override
            public double getY() {
                return 0;
            }
        };

        Rectangle2D rect = new Rectangle2D.Double(5, 5, 10, 10);
        System.out.println(shape.contains(rect));
    }
}
