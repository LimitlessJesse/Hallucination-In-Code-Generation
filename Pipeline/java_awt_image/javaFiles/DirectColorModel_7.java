import java.awt.image.DirectColorModel;

public class DirectColorModel_7 {
    public static void main(String[] args) {
        DirectColorModel dcm = new DirectColorModel(32, 0xFF0000, 0xFF00, 0xFF, 0xFF000000);
        int rgb = 0xAABBCCDD;
        int alpha = dcm.getAlpha(rgb);
        System.out.println("Alpha value: " + alpha);
    }
}
