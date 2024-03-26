import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_28 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.writeDouble(123.456);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
