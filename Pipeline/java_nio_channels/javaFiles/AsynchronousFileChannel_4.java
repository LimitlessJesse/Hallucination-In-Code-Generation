import java.io.IOException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class AsynchronousFileChannel_4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("file.txt");
        AsynchronousFileChannel channel = AsynchronousFileChannel.open(path, StandardOpenOption.WRITE);
        channel.force(true);
        channel.close();
    }
}
