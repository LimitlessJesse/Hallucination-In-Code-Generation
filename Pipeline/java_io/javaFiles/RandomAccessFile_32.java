import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_32 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.writeChar('H');
            raf.writeChar('i');
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
