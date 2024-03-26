import java.net.Proxy;

public class Proxy_8 {
    public static void main(String[] args) {
        Proxy proxy1 = new Proxy(Proxy.Type.HTTP, java.net.InetSocketAddress.createUnresolved("localhost", 8080));
        Proxy proxy2 = new Proxy(Proxy.Type.HTTP, java.net.InetSocketAddress.createUnresolved("localhost", 8080));

        System.out.println(proxy1.equals(proxy2)); // Output: true
    }
}
