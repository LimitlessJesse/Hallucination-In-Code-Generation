import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterOutputStream_2 {
    public static void main(String[] args) {
        OutputStream outputStream = new FilterOutputStream(System.out) {
            @Override
            public void write(byte[] b) throws IOException {
                super.write(b);
            }
        };

        try {
            outputStream.write("Hello, World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
