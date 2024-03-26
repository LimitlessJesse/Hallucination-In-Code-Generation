import java.awt.color.ColorSpace;

public class ColorSpace_1 {
    public static void main(String[] args) {
        float[] rgb = {100, 200, 150};
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_RGB);
        float[] converted = cs.fromRGB(rgb);
        for (float f : converted) {
            System.out.println(f);
        }
    }
}
