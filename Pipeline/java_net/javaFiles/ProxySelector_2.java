import java.net.*;
import java.util.*;

public class ProxySelector_2 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://example.com");
            ProxySelector selector = ProxySelector.getDefault();
            List<Proxy> proxies = selector.select(uri);
            for (Proxy proxy : proxies) {
                System.out.println(proxy.type() + ": " + proxy.address());
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
