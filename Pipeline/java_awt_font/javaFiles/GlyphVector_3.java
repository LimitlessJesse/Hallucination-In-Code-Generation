import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class GlyphVector_3 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        GlyphVector gv = font.createGlyphVector(frc, "Hello");

        for (int i = 0; i < gv.getNumGlyphs(); i++) {
            Rectangle2D bounds = gv.getGlyphMetrics(i).getBounds2D();
            System.out.println("Glyph " + i + " bounds: " + bounds);
        }
    }
}
