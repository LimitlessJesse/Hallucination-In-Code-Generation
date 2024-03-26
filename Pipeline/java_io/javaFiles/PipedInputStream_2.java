import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputStream_2 {
    public static void main(String[] args) {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        try {
            pis.connect(pos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            try {
                pos.write("Hello, World!".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                int data = pis.read();
                while (data!= -1) {
                    System.out.print((char) data);
                    data = pis.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
