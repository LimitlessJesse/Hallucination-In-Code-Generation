import javax.activation.URLDataSource;
import java.net.URL;

public class URLDataSource_4 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://example.com");
        URLDataSource dataSource = (URLDataSource) url.getContent();
        String contentType = dataSource.getContentType();
        System.out.println("Content Type: " + contentType);
    }
}
