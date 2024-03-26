import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_40 {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("test.txt", "rw")) {
            raf.writeUTF("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
