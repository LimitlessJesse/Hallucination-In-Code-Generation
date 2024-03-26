import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_7 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            byte[] bytes = "Hello, World!".getBytes();
            raf.write(bytes, 0, bytes.length);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
