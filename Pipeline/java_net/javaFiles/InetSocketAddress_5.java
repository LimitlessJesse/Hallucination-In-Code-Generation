import java.net.InetSocketAddress;

public class InetSocketAddress_5 {
    public static void main(String[] args) {
        InetSocketAddress socketAddress = new InetSocketAddress("www.example.com", 80);
        String hostName = socketAddress.getHostName();
        System.out.println("Host Name: " + hostName);
    }
}
