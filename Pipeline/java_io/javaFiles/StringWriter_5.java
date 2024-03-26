import java.io.StringWriter;
import java.io.IOException;

public class StringWriter_5 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        try {
            writer.write(chars, 0, chars.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(writer.toString());
    }
}
