import java.io.Reader;
import java.io.StringReader;
import java.io.IOException;

public class Reader_1 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Reader reader = new StringReader(str);
        char[] cbuf = new char[10];
        int off = 0;
        int len = 10;
        try {
            int numCharsRead = reader.read(cbuf, off, len);
            if (numCharsRead!= -1) {
                System.out.println("Number of characters read: " + numCharsRead);
                System.out.println("Characters read: " + new String(cbuf, off, numCharsRead));
            } else {
                System.out.println("End of stream reached");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
