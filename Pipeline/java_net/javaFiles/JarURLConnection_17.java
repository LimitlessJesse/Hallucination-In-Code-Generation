import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.jar.JarEntry;

public class JarURLConnection_17 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("jar:file:/path/to/your.jar!/");
        URLConnection urlConnection = url.openConnection();
        if (urlConnection instanceof JarURLConnection) {
            JarURLConnection jarURLConnection = (JarURLConnection) urlConnection;
            JarEntry jarEntry = jarURLConnection.getJarEntry();
            System.out.println(jarEntry.getName());
        }
    }
}
