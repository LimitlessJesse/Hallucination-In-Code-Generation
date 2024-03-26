import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_16 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.writeChars("Hello, World!");
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
