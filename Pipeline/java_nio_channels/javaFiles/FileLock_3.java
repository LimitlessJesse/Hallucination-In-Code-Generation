import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileLock_3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file.txt");
        FileChannel fc = fos.getChannel();
        FileLock lock = fc.tryLock();

        if (lock!= null) {
            System.out.println("Lock is shared: " + lock.isShared());
        }

        lock.release();
        fc.close();
        fos.close();
    }
}
