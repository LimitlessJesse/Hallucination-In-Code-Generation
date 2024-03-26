import java.io.Writer;
import java.io.StringWriter;

public class Writer_1 {
    public static void main(String[] args) {
        Writer writer = new StringWriter();
        try {
            writer.write('H');
            writer.write('i');
            writer.write('\n');
            writer.write('W');
            writer.write('o');
            writer.write('r');
            writer.write('l');
            writer.write('d');
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(writer.toString());
    }
}
