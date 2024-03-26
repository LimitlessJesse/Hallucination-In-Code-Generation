import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_10 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            file.createNewFile();

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.write("Hello, World!".getBytes());

            // Set the length of the file to 5 bytes
            raf.setLength(5);

            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
