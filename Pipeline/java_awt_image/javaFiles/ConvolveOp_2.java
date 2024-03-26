import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class ConvolveOp_2 {
    public static void main(String[] args) {
        // Create a new BufferedImage
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

        // Create a new BufferedImage to hold the result
        BufferedImage dst = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

        // Create a new Kernel
        float[] kernelData = {
            0.0625f, 0.125f, 0.0625f,
            0.125f, 0.25f, 0.125f,
            0.0625f, 0.125f, 0.0625f
        };
        Kernel kernel = new Kernel(3, 3, kernelData);

        // Create a new ConvolveOp
        ConvolveOp convolveOp = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);

        // Apply the filter to the source image and store the result in the destination image
        convolveOp.filter(src, dst);
    }
}
