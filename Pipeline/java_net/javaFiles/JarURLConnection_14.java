import java.net.URL;
import java.net.JarURLConnection;
import java.io.IOException;

public class JarURLConnection_14 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("jar:file:/path/to/your.jar!/path/to/resource");
        JarURLConnection jarConn = (JarURLConnection) url.openConnection();
        URL jarFileURL = jarConn.getJarFileURL();
        System.out.println(jarFileURL);
    }
}
