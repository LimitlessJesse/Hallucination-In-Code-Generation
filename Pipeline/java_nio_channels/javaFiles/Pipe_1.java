import java.nio.channels.Pipe;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class Pipe_1 {
    public static void main(String[] args) throws Exception {
        Pipe pipe = Pipe.open();
        WritableByteChannel outChannel = pipe.sink().channel();
        ReadableByteChannel inChannel = pipe.source().channel();

        outChannel.write(java.nio.charset.Charset.defaultCharset().encode("Hello"));

        byte[] buffer = new byte[1024];
        int bytesRead = inChannel.read(buffer);
        String message = new String(buffer, 0, bytesRead);

        System.out.println(message);
    }
}
