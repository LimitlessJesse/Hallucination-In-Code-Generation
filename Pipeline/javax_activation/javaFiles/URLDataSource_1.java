import javax.activation.URLDataSource;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDataSource_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            URLDataSource dataSource = new URLDataSource(url);
            URL urlFromDataSource = dataSource.getURL();
            System.out.println("URL from data source: " + urlFromDataSource);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
