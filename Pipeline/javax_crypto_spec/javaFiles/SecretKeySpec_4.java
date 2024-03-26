import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class SecretKeySpec_4 {
    public static void main(String[] args) {
        Key key = new SecretKeySpec("myKey".getBytes(), "AES");
        System.out.println(key.getFormat());
    }
}
