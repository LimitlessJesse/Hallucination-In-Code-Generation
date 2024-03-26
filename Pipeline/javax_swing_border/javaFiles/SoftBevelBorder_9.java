import javax.swing.border.SoftBevelBorder;

public class SoftBevelBorder_9 {
    public static void main(String[] args) {
        SoftBevelBorder border = new SoftBevelBorder(0);
        boolean isOpaque = border.isBorderOpaque();
        System.out.println("Is border opaque? " + isOpaque);
    }
}
