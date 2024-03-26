import java.io.StringWriter;

public class StringWriter_14 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        writer.write('H');
        writer.write('e');
        writer.write('l');
        writer.write('l');
        writer.write('o');
        System.out.println(writer.toString());
    }
}
