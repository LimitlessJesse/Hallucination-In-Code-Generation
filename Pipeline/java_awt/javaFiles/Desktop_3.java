import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Desktop_3 {
    public static void main(String[] args) {
        try {
            Desktop desktop = Desktop.getDesktop();
            URI mailto = new URI("mailto:recipient@example.com?subject=subject&body=body");
            desktop.mail(mailto);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
