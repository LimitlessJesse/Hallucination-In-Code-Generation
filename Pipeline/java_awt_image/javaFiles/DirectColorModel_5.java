import java.awt.image.DirectColorModel;

public class DirectColorModel_5 {
    public static void main(String[] args) {
        DirectColorModel dcm = new DirectColorModel(32, 0xFF0000, 0xFF00, 0xFF, 0xFF000000);
        int alphaMask = dcm.getAlphaMask();
        System.out.println("Alpha Mask: " + alphaMask);
    }
}
