import java.awt.image.ComponentColorModel;

public class ComponentColorModel_1 {
    public static void main(String[] args) {
        ComponentColorModel colorModel = new ComponentColorModel(
            new int[] { 0, 1 }, // red, green
            new int[] { 0, 1 }, // blue, alpha
            false, // has alpha
            false, // is opaque
            null // color space
        );

        int pixel = colorModel.getRGB(0, 0, 0, 0); // black pixel
        int alpha = colorModel.getAlpha(pixel);

        System.out.println("Alpha value of black pixel: " + alpha);
    }
}
