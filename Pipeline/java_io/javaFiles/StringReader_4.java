import java.io.StringReader;

public class StringReader_4 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello World!");
        System.out.println(reader.ready()); // Output: true
        while (reader.ready()) {
            System.out.print((char) reader.read());
        }
        System.out.println(); // Output: Hello World!
    }
}
