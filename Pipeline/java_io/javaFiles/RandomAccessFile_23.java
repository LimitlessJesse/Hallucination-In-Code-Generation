import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_23 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.writeLong(1234567890L);
            raf.seek(0);
            long value = raf.readLong();
            System.out.println("Value read: " + value);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
