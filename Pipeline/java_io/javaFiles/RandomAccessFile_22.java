import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_22 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
            raf.writeInt(123456789);
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
