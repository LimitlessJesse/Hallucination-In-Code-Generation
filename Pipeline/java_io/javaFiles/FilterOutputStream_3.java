import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_3 {
    public static void main(String[] args) {
        FilterOutputStream outputStream = new FilterOutputStream(null) {
            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                // Your implementation here
            }
        };

        try {
            byte[] bytes = "Hello, World!".getBytes();
            outputStream.write(bytes, 0, bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
