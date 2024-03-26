import java.awt.RenderingHints;
import java.awt.image.ColorConvertOp;

public class ColorConvertOp_2 {
    public static void main(String[] args) {
        ColorConvertOp colorConvertOp = new ColorConvertOp(RenderingHints.VALUE_COLOR_BURN, null);
        RenderingHints renderingHints = colorConvertOp.getRenderingHints();
        System.out.println(renderingHints);
    }
}
