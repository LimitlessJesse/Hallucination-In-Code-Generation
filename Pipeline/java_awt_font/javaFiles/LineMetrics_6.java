import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;

public class LineMetrics_6 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        Graphics g = null;
        FontRenderContext frc = g.getFontRenderContext();
        String text = "Hello";
        LineMetrics lm = font.getStringMetrics(text, frc);
        float strikethroughThickness = lm.getStrikethroughThickness();
        System.out.println("Strikethrough Thickness: " + strikethroughThickness);
    }
}
