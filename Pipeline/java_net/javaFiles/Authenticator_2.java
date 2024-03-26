import java.net.*;
import java.util.Properties;

public class Authenticator_2 {
    public static void main(String[] args) {
        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("username", "password".toCharArray());
            }
        });

        try {
            URL url = new URL("http://example.com");
            URLConnection conn = url.openConnection();
            conn.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
