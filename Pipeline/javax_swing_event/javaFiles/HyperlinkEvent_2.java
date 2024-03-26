import javax.swing.event.HyperlinkEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class HyperlinkEvent_2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            HyperlinkEvent event = new HyperlinkEvent(url, HyperlinkEvent.EventType.ACTIVATED);
            URL result = event.getURL();
            System.out.println(result);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
