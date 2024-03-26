import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_5 {
    public static void main(String[] args) {
        try {
            FilterOutputStream outputStream = new FileOutputStream("output.txt");
            outputStream.write("Hello, World!".getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
