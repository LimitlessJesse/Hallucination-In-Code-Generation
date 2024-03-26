import java.io.StringWriter;
import java.io.IOException;

public class StringWriter_7 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        String str = "Hello, World!";
        try {
            writer.write(str, 7, 5);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(writer.toString());
    }
}
