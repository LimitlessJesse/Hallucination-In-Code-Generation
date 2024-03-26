import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_21 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.writeInt(123456789);
            raf.seek(0);
            int value = raf.readInt();
            System.out.println("Value: " + value);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
