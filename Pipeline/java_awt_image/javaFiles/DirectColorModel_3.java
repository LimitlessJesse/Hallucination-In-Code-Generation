import java.awt.image.DirectColorModel;

public class DirectColorModel_3 {
    public static void main(String[] args) {
        DirectColorModel dcm = new DirectColorModel(32, 0x00ff0000, 0x0000ff00, 0x000000ff);
        int greenMask = dcm.getGreenMask();
        System.out.println("Green Mask: " + greenMask);
    }
}
