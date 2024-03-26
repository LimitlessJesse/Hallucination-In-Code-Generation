import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_6 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");

            // Write some bytes to the file
            byte[] bytes = "Hello, World!".getBytes();
            raf.write(bytes);

            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
