import java.awt.Color;

public class Color_4 {
    public static void main(String[] args) {
        Color color = new Color(100, 200, 150);
        int rgb = color.getRGB();
        System.out.println("RGB value: " + Integer.toHexString(rgb));
    }
}
