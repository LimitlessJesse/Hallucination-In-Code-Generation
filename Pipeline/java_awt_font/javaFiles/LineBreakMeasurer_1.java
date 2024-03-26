import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextLayout;
import java.awt.font.TextAttribute;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.BreakIterator;
import java.awt.GraphicsEnvironment;
import java.awt.Font;
import java.awt.FontMetrics;

public class LineBreakMeasurer_1 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Font font = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts()[0];
        FontMetrics fontMetrics = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration().getFontMetrics(font);
        AttributedString attributedString = new AttributedString(text);
        attributedString.addAttribute(TextAttribute.FONT, font);
        AttributedCharacterIterator iterator = attributedString.getIterator();
        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(iterator);
        LineBreakMeasurer measurer = new LineBreakMeasurer(iterator, breakIterator);
        TextLayout layout = measurer.nextLayout(fontMetrics.getMaxAscent() + fontMetrics.getMaxDescent());
        float position = measurer.getPosition();
        System.out.println("Current position: " + position);
    }
}
