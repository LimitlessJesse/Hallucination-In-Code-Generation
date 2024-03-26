import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.geom.AffineTransform;

public class AffineTransformOp_2 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        BufferedImage dst = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);

        AffineTransform at = new AffineTransform();
        at.scale(2, 2);

        AffineTransformOp op = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
        op.filter(src, dst);
    }
}
