import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_5 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.write(65); // writes 'A' to the file
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
