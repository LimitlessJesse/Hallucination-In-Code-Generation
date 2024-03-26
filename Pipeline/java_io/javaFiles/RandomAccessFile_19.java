import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_19 {
    public static void main(String[] args) {
        try {
            File file = new File("your_file_path");
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            int byteValue = raf.readUnsignedByte();
            System.out.println("The unsigned byte value is: " + byteValue);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
