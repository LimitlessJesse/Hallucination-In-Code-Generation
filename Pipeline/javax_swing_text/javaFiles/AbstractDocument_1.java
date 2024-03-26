import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class AbstractDocument_1 {
    public static void main(String[] args) {
        AbstractDocument doc = new AbstractDocument() {
            @Override
            public void setDocumentFilter(DocumentFilter filter) {
                super.setDocumentFilter(filter);
            }
        };

        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                fb.insertString(offset, string.toUpperCase(), attr);
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                fb.replace(offset, length, text.toUpperCase(), attrs);
            }
        });
    }
}
