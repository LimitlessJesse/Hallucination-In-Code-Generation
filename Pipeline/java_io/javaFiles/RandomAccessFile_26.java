import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_26 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
            raf.writeFloat(123.45f);
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
