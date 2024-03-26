import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;

public class LineMetrics_5 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        String text = "Hello";
        FontMetrics fm = new FontMetrics(font) {
            @Override
            public int getStrikethroughOffset() {
                return super.getStrikethroughOffset();
            }
        };
        LineMetrics lm = fm.getLineMetrics(text, frc);
        System.out.println(lm.getStrikethroughOffset());
    }
}
