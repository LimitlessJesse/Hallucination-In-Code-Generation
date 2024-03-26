import java.io.Writer;
import java.io.StringWriter;

public class Writer_2 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        writer.write(chars);
        System.out.println(writer.toString());
    }
}
