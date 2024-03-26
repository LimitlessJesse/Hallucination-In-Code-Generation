import java.io.StringWriter;

public class StringWriter_10 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        writer.append('H');
        writer.append('e');
        writer.append('l');
        writer.append('l');
        writer.append('o');
        System.out.println(writer.toString());
    }
}
