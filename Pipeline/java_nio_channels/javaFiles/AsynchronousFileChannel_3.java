import java.io.IOException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class AsynchronousFileChannel_3 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("file.txt");
        AsynchronousFileChannel channel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);
        Future<Long> sizeFuture = channel.size();
        long size = sizeFuture.get();
        System.out.println("Size of the file: " + size);
        channel.close();
    }
}
