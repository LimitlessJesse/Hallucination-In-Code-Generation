import javax.tools.ForwardingFileObject;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ForwardingFileObject_2 {
    public static void main(String[] args) {
        ForwardingFileObject fileObject = new ForwardingFileObject() {
            @Override
            public Reader openReader(boolean ignoreEncodingErrors) throws IOException {
                return new StringReader("Hello, World!");
            }
        };

        try (Reader reader = fileObject.openReader(true)) {
            int read;
            while ((read = reader.read())!= -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
