import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_52 {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.writeBoolean(true);
            raf.seek(0);
            boolean value = raf.readBoolean();
            System.out.println(value);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
