import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileLock_5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        FileChannel fc = fos.getChannel();
        FileLock lock = fc.lock();
        System.out.println("Lock size: " + lock.size());
        lock.release();
        fc.close();
        fos.close();
    }
}
