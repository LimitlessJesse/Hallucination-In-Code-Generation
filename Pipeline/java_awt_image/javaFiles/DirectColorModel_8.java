import java.awt.image.DirectColorModel;

public class DirectColorModel_8 {
    public static void main(String[] args) {
        DirectColorModel dcm = new DirectColorModel(32, 0xFF0000, 0xFF00, 0xFF, 0xFF000000);
        int rgb = 0xFF0000;
        int red = dcm.getRed(rgb);
        System.out.println("Red: " + red);
    }
}
