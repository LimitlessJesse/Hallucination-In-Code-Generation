import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.sax.SAXSource;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.StringReader;

public class SAXResult_2 {
    public static void main(String[] args) {
        try {
            // Create a SAXSource
            SAXSource source = new SAXSource(new DefaultHandler() {
                @Override
                public void startDocument() throws SAXException {
                    System.out.println("Start document");
                }

                @Override
                public void endDocument() throws SAXException {
                    System.out.println("End document");
                }
            }, new InputSource(new StringReader("<root><element>Content</element></root>")));

            // Create a SAXResult
            SAXResult result = new SAXResult();

            // Set the ContentHandler
            result.setHandler(new DefaultHandler() {
                @Override
                public void startDocument() throws SAXException {
                    System.out.println("Start document");
                }

                @Override
                public void endDocument() throws SAXException {
                    System.out.println("End document");
                }
            });

            // Transform
            source.getTransformer().transform(source.getXMLReader(), result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
