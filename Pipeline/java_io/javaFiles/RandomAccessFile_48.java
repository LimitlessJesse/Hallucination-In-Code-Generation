import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_48 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.writeFloat(123.456f);
            raf.seek(0);
            float value = raf.readFloat();
            System.out.println("Read float value: " + value);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
