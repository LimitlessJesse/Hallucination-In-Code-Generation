import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputStream_1 {
    public static void main(String[] args) {
        try {
            PipedInputStream pipedInputStream = new PipedInputStream();
            PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);

            // Write some data to the output stream
            String data = "Hello, World!";
            pipedOutputStream.write(data.getBytes());

            // Get the number of bytes that can be read without blocking
            int availableBytes = pipedInputStream.available();
            System.out.println("Available bytes: " + availableBytes);

            // Close the streams
            pipedInputStream.close();
            pipedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
