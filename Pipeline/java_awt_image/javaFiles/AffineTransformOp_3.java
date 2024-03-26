import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;

public class AffineTransformOp_3 {
    public static void main(String[] args) {
        AffineTransform transform = new AffineTransform();
        AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_BILINEAR);
        AffineTransform newTransform = op.getTransform();
        System.out.println(newTransform);
    }
}
