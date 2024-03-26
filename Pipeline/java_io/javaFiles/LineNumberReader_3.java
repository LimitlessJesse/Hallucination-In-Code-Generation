import java.io.LineNumberReader;
import java.io.StringReader;
import java.io.IOException;

public class LineNumberReader_3 {
    public static void main(String[] args) {
        StringReader stringReader = new StringReader("Hello\nWorld\nJava");
        LineNumberReader lineNumberReader = new LineNumberReader(stringReader);

        try {
            lineNumberReader.setLineNumber(2);
            System.out.println(lineNumberReader.readLine()); // Output: World
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
