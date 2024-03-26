import java.io.IOException;
import java.net.*;

public class ProxySelector_3 {
    public static void main(String[] args) {
        ProxySelector.setDefault(new ProxySelector() {
            @Override
            public java.util.List<Proxy> select(URI uri) {
                return java.util.Collections.singletonList(Proxy.NO_PROXY);
            }

            @Override
            public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
                System.out.println("Connection to " + uri + " via " + sa + " failed: " + ioe);
            }
        });

        try {
            URL url = new URL("http://example.com");
            URLConnection conn = url.openConnection();
            conn.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
