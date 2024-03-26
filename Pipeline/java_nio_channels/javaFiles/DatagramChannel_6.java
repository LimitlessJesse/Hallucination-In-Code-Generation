import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_6 {
    public static void main(String[] args) throws IOException {
        DatagramChannel channel = DatagramChannel.open();
        channel.connect(new InetSocketAddress("localhost", 8080));

        String message = "Hello, World!";
        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());

        channel.write(new ByteBuffer[]{buffer}, 0, message.length());

        channel.close();
    }
}
