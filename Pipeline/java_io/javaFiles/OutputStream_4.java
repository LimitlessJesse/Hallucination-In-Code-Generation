import java.io.OutputStream;
import java.io.IOException;

public class OutputStream_4 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                // Implementation not needed for this example
            }
        };

        try {
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
