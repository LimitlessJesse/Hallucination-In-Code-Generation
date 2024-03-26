import java.net.Proxy;

public class Proxy_10 {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, null);
        System.out.println(proxy.toString());
    }
}
