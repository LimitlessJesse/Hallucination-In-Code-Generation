import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriter_1 {
    public static void main(String[] args) {
        PipedWriter writer = new PipedWriter();
        PipedReader reader = new PipedReader();

        try {
            writer.connect(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            try {
                writer.write("Hello, World!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                int data = reader.read();
                while (data!= -1) {
                    System.out.print((char) data);
                    data = reader.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
