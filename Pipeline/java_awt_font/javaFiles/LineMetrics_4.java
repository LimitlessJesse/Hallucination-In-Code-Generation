import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;

public class LineMetrics_4 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Font font = new Font("Arial", Font.PLAIN, 12);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        LineMetrics lm = font.getStringMetrics(text, frc);
        float height = lm.getHeight();
        System.out.println("Height of the line of text: " + height);
    }
}
