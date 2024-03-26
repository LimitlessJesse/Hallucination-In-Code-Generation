import java.io.StringWriter;

public class StringWriter_23 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        writer.write("Hello, World!");
        System.out.println(writer.toString());
        writer.flush();
        System.out.println(writer.toString());
    }
}
