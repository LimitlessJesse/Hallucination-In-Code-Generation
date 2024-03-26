import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream_2 {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("file.txt"))) {
            byte[] buffer = new byte[1024];
            int bytesRead = dis.read(buffer);
            if (bytesRead!= -1) {
                System.out.println(new String(buffer, 0, bytesRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
