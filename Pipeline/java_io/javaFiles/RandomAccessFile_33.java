import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_33 {
    public static void main(String[] args) {
        try {
            File file = new File("your_file_path");
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            short value = raf.readShort();
            System.out.println("Value read: " + value);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
