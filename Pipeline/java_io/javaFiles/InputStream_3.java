import java.io.IOException;
import java.io.InputStream;

public class InputStream_3 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        byte[] buffer = new byte[1024];
        try {
            int bytesRead = inputStream.read(buffer, 0, buffer.length);
            if (bytesRead!= -1) {
                System.out.println("Read " + bytesRead + " bytes:");
                System.out.write(buffer, 0, bytesRead);
            } else {
                System.out.println("No more data available");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
