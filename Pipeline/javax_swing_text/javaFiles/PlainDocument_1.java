import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class PlainDocument_1 {
    public static void main(String[] args) {
        PlainDocument document = new PlainDocument();
        try {
            document.insertString(0, "Hello", null);
            System.out.println(document.getText(0, document.getLength()));
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
