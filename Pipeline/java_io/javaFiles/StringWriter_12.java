import java.io.StringWriter;

public class StringWriter_12 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        writer.write("Hello, World!");
        System.out.println(writer.toString());
        writer.flush();
        System.out.println(writer.toString());
    }
}
