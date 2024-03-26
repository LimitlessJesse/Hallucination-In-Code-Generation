import java.awt.geom.AffineTransform;
import java.awt.image.renderable.RenderContext;

public class RenderContext_4 {
    public static void main(String[] args) {
        RenderContext rc = null; // initialize RenderContext
        AffineTransform at = rc.getTransform();
        System.out.println(at);
    }
}
