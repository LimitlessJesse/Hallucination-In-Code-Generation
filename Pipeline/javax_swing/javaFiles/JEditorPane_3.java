import javax.swing.JEditorPane;
import javax.swing.text.html.HTMLEditorKit;

public class JEditorPane_3 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        editorPane.setText("<html>Hello, World!</html>");
        HTMLEditorKit kit = new HTMLEditorKit();
        kit.insertHTML(editorPane.getDocument(), 0, "<b>Hello, World!</b>", 0, 0, null);
        String text = editorPane.getText();
        System.out.println(text);
    }
}
