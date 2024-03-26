import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;

public class CharArrayWriter_5 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        try {
            writer.write("Hello, World!");
            StringWriter stringWriter = new StringWriter();
            writer.writeTo(stringWriter);
            System.out.println(stringWriter.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
