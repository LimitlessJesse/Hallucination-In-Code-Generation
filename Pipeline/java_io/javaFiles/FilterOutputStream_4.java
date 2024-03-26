import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_4 {
    public static void main(String[] args) {
        try {
            FilterOutputStream fos = new FilterOutputStream(System.out) {
                @Override
                public void flush() throws IOException {
                    System.out.println("Flushing...");
                    super.flush();
                }
            };

            fos.write("Hello, World!".getBytes());
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
