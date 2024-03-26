import java.io.OutputStream;
import java.io.IOException;

public class OutputStream_1 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                System.out.write(b);
            }
        };

        try {
            outputStream.write('A');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
