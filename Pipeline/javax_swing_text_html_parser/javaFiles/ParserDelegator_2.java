import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.StringReader;

public class ParserDelegator_2 {
    public static void main(String[] args) {
        String html = "<html><body><h1>Hello, World!</h1></body></html>";
        ParserDelegator delegator = new ParserDelegator();
        delegator.parse(new StringReader(html), new HTMLEditorKit.ParserCallback() {
            public void handleText(char[] text, int pos) {
                System.out.println(new String(text));
            }
        }, true);
    }
}
