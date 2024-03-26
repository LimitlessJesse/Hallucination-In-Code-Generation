import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_1 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.write("Hello, World!".getBytes());
            raf.seek(0);
            int b;
            while ((b = raf.read())!= -1) {
                System.out.print((char) b);
            }
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
