import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_41 {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("file.txt", "r")) {
            String str = raf.readUTF();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
