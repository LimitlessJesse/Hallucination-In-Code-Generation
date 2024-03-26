import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_9 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            long length = raf.length();
            System.out.println("Length of the file: " + length + " bytes");
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
