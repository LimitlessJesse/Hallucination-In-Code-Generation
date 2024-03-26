import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLock_4 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            FileChannel channel = FileChannel.open(file.toPath());
            FileLock lock = channel.lock();
            long position = lock.position();
            System.out.println("Position of the file lock: " + position);
            lock.release();
            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
