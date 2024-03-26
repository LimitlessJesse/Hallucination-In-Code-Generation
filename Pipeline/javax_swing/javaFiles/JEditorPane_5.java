import javax.swing.JEditorPane;
import javax.swing.event.HyperlinkListener;

public class JEditorPane_5 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        HyperlinkListener listener = event -> {
            // Handle hyperlink event
        };
        editorPane.addHyperlinkListener(listener);
        editorPane.removeHyperlinkListener(listener);
    }
}
