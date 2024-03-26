import java.io.StringWriter;

public class StringWriter_9 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        writer.append("Hello, World!", 7, 12);
        System.out.println(writer.toString());
    }
}
