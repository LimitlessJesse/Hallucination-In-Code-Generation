import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class XMLDecoder_3 {
    public static void main(String[] args) {
        XMLDecoder decoder = null;
        try {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("file.xml")));
            // Use the decoder
        } finally {
            if (decoder!= null) {
                decoder.close();
            }
        }
    }
}
