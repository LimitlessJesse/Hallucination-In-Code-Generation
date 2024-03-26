import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriter_2 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        try {
            writer.write('H');
            writer.write('e');
            writer.write('l');
            writer.write('l');
            writer.write('o');
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(writer.toString());
    }
}
