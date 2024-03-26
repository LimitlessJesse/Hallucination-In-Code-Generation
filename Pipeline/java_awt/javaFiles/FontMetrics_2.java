import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class FontMetrics_2 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font font = ge.getAllFonts()[0];
        FontMetrics fm = new FontMetrics(font) {
            @Override
            public int getDescent() {
                return 0;
            }
        };
        System.out.println(fm.getDescent());
    }
}
