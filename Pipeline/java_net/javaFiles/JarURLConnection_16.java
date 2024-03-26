import java.net.JarURLConnection;
import java.net.URL;
import java.util.jar.Manifest;

public class JarURLConnection_16 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://example.com/myjar.jar");
        JarURLConnection jarConn = (JarURLConnection) url.openConnection();
        Manifest manifest = jarConn.getManifest();
        System.out.println(manifest);
    }
}
