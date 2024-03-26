import java.io.LineNumberReader;
import java.io.StringReader;
import java.io.IOException;

public class LineNumberReader_1 {
    public static void main(String[] args) {
        StringReader stringReader = new StringReader("Hello\nWorld\nJava");
        LineNumberReader lineNumberReader = new LineNumberReader(stringReader);

        try {
            String line;
            while ((line = lineNumberReader.readLine())!= null) {
                System.out.println("Line number: " + lineNumberReader.getLineNumber() + ", Line: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
