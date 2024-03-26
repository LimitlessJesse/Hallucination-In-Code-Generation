import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_27 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.writeDouble(123.456);
            raf.seek(0);
            double value = raf.readDouble();
            System.out.println("Value read from file: " + value);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
