import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.StringReader;

public class HTMLEditorKit_ParserCallback_4 {
    public static void main(String[] args) {
        String html = "<html><body><p>Hello, World!</p></body></html>";
        ParserDelegator delegator = new ParserDelegator();
        delegator.parse(new HTMLEditorKit.ParserCallback() {
            @Override
            public void handleSimpleTag(HTML.Tag t, MutableAttributeSet a, int pos) {
                System.out.println("Simple tag: " + t.toString());
            }
        }, new StringReader(html), true);
    }
}
