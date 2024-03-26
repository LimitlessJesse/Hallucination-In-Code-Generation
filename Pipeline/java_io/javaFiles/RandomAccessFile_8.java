import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_8 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");

            // Write some data to the file
            raf.writeBytes("Hello, World!");

            // Move the file pointer to the beginning of the file
            raf.seek(0);

            // Read and print the data
            byte[] bytes = new byte[(int) file.length()];
            raf.read(bytes);
            System.out.println(new String(bytes));

            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
