import java.net.URL;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.io.IOException;
import java.util.jar.JarFile;

public class JarURLConnection_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("jar:file:/path/to/your.jar!/");
            JarURLConnection jarConn = (JarURLConnection) url.openConnection();
            JarFile jarFile = jarConn.getJarFile();
            System.out.println("Jar file: " + jarFile.getName());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
