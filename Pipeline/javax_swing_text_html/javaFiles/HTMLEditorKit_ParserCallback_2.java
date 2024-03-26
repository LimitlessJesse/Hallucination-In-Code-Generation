import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class HTMLEditorKit_ParserCallback_2 {
    public static void main(String[] args) {
        String html = "<html><body><h1>Hello, World!</h1></body></html>";
        List<String> tags = new ArrayList<>();

        HTMLEditorKit.ParserCallback parserCallback = new HTMLEditorKit.ParserCallback() {
            @Override
            public void handleStartTag(HTML.Tag t, MutableAttributeSet a, int pos) {
                if (t == HTML.Tag.BODY) {
                    tags.add("body");
                } else if (t == HTML.Tag.H1) {
                    tags.add("h1");
                }
            }
        };

        ParserDelegator delegator = new ParserDelegator();
        delegator.parse(new StringReader(html), parserCallback, true);

        System.out.println("Found tags: " + tags);
    }
}
