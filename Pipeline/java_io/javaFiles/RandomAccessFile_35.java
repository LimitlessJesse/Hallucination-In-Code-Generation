import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_35 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.writeByte((byte) 65); // Write 'A' to the file
            raf.seek(0); // Move the file pointer to the beginning of the file
            int b = raf.readByte(); // Read a byte from the file
            System.out.println(b); // Print the byte value
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
