import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class DefaultStyledDocument_4 {
    public static void main(String[] args) {
        DefaultStyledDocument doc = new DefaultStyledDocument();
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet a = sc.addAttribute(sc.getEmptySet(), StyleConstants.Foreground, Color.red);
        doc.setCharacterAttributes(0, doc.getLength(), a, false);
    }
}
