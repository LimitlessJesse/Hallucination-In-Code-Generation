import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriter_4 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        char[] cbuf = {'H', 'e', 'l', 'l', 'o'};
        try {
            writer.write(cbuf, 0, cbuf.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(writer.toString());
    }
}
