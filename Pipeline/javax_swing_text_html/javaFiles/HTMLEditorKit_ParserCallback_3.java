import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.StringReader;

public class HTMLEditorKit_ParserCallback_3 {
    public static void main(String[] args) {
        String html = "<html><body><p>Hello, World!</p></body></html>";
        ParserDelegator delegator = new ParserDelegator();
        HTMLEditorKit kit = new HTMLEditorKit();
        kit.setParser(delegator);
        kit.setOut(new HTMLEditorKit.ParserCallback() {
            @Override
            public void handleEndTag(HTML.Tag t, int pos) {
                System.out.println("End tag: " + t.toString() + " at position: " + pos);
            }
        });
        try {
            StringReader reader = new StringReader(html);
            kit.parse(reader, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
