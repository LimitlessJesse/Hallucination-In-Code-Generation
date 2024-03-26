import java.net.InetSocketAddress;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_2 {
    public static void main(String[] args) throws Exception {
        DatagramChannel channel = DatagramChannel.open();
        channel.bind(new InetSocketAddress(9999));
    }
}
