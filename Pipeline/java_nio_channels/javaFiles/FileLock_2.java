import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLock_2 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("test.txt");
        FileChannel fc = fos.getChannel();
        FileLock lock = fc.tryLock();

        // do something with the file

        lock.release(); // release the lock
        fc.close();
        fos.close();
    }
}
