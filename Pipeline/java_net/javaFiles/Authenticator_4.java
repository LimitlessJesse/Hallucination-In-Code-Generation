import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class Authenticator_4 {
    public static void main(String[] args) {
        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("username", "password".toCharArray());
            }
        });
    }
}
