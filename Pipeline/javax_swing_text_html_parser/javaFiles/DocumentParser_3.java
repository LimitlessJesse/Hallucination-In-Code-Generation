import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.DocumentParser;
import java.io.StringReader;
import java.io.IOException;

public class DocumentParser_3 {
    public static void main(String[] args) {
        String html = "<html><body><h1>Hello, World!</h1></body></html>";
        StringReader reader = new StringReader(html);
        DocumentParser parser = new DocumentParser();

        parser.parse(reader, new HTMLEditorKit.ParserCallback() {
            @Override
            public void handleText(char[] text, int pos) {
                System.out.println(new String(text));
            }
        }, true);
    }
}
