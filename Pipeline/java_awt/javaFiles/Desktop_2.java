import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

public class Desktop_2 {
    public static void main(String[] args) {
        try {
            Desktop desktop = Desktop.getDesktop();
            URI uri = new URI("http://www.google.com");
            desktop.browse(uri);
        } catch (URISyntaxException | java.awt.AWTException e) {
            e.printStackTrace();
        }
    }
}
