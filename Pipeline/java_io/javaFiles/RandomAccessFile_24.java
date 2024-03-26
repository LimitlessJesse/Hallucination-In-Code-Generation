import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_24 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            long value = 1234567890L;
            raf.writeLong(value);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
