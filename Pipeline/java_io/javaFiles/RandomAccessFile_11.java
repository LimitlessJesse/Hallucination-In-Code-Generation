import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFile_11 {
    public static void main(String[] args) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile("file.txt", "rw");
            // write something to the file
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file!= null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
