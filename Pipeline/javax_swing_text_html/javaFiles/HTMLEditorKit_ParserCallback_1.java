import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.StringReader;

public class HTMLEditorKit_ParserCallback_1 {
    public static void main(String[] args) {
        String html = "<html><body><p>Hello, World!</p></body></html>";
        ParserDelegator delegator = new ParserDelegator();
        HTMLEditorKit kit = new HTMLEditorKit();
        kit.getViewFactory().addView(new HTMLEditorKit.ParserCallback() {
            @Override
            public void handleText(char[] text, int pos) {
                System.out.println(new String(text));
            }
        });
        try {
            delegator.parse(new StringReader(html), kit.createReader(new StringReader(html)), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
