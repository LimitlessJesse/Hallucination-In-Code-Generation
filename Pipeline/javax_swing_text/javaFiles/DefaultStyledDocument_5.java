import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class DefaultStyledDocument_5 {
    public static void main(String[] args) {
        StyledDocument doc = new DefaultStyledDocument();
        AttributeSet attr = new SimpleAttributeSet();
        StyleConstants.setFontFamily(attr, "Arial");
        StyleConstants.setFontSize(attr, 12);
        StyleConstants.setForeground(attr, Color.BLACK);
        doc.setParagraphAttributes(0, doc.getLength(), attr, false);
    }
}
