import java.awt.image.DirectColorModel;

public class DirectColorModel_9 {
    public static void main(String[] args) {
        DirectColorModel dcm = new DirectColorModel(32, 0x00ff0000, 0x0000ff00, 0x000000ff);
        int rgb = 0xff00ff00;
        int green = dcm.getGreen(rgb);
        System.out.println("Green component: " + green);
    }
}
