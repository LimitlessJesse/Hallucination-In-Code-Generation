import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;

public class GlyphVector_2 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        GlyphVector gv = font.createGlyphVector(frc, "Hello");
        int numGlyphs = gv.getNumGlyphs();
        System.out.println("Number of glyphs: " + numGlyphs);
    }
}
