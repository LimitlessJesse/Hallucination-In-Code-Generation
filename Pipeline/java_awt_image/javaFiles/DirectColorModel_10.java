import java.awt.image.DirectColorModel;

public class DirectColorModel_10 {
    public static void main(String[] args) {
        DirectColorModel dcm = new DirectColorModel(32, 0x00ff0000, 0x0000ff00, 0x000000ff);
        int rgb = 0xff00ff00;
        int blue = dcm.getBlue(rgb);
        System.out.println("Blue: " + blue);
    }
}
