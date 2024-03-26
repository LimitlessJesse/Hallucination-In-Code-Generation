import java.io.FilterWriter;
import java.io.IOException;
import java.io.StringWriter;

public class FilterWriter_1 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        FilterWriter filterWriter = new FilterWriter(writer) {
            @Override
            public void write(int c) throws IOException {
                super.write(c);
            }
        };

        try {
            filterWriter.write('H');
            filterWriter.write('e');
            filterWriter.write('l');
            filterWriter.write('l');
            filterWriter.write('o');
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(writer.toString());
    }
}
