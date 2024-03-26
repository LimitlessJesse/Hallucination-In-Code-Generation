import java.awt.geom.Path2D;

public class Path2D_Double_12 {
    public static void main(String[] args) {
        Path2D.Double path = new Path2D.Double();
        path.moveTo(10, 10);
        path.lineTo(20, 20);

        Path2D.Double clonePath = (Path2D.Double) path.clone();

        System.out.println("Original Path: " + path);
        System.out.println("Cloned Path: " + clonePath);
    }
}
