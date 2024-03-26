import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_2 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            byte[] b = new byte[(int) file.length()];
            raf.read(b);
            System.out.println(new String(b));
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
