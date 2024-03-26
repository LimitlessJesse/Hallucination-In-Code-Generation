import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_3 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                // Implementation not needed for this example
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                // Implementation of write method
                for (int i = off; i < off + len; i++) {
                    System.out.print((char) b[i]);
                }
            }
        };

        try {
            outputStream.write("Hello, World!".getBytes(), 0, 13);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
