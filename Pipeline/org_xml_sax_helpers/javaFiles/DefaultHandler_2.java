import org.xml.sax.helpers.DefaultHandler;

public class DefaultHandler_2 {
    public static void main(String[] args) {
        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void endDocument() {
                System.out.println("End of document");
            }
        };

        // Here you would parse the XML document using a SAX parser
        // and pass the handler to the parser.
        // For the purpose of this example, we'll just call the method directly.
        handler.endDocument();
    }
}
