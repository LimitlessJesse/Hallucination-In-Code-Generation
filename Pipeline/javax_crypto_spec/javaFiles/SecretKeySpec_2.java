import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class SecretKeySpec_2 {
    public static void main(String[] args) {
        String myKey = "myKey";
        Key key = new SecretKeySpec(myKey.getBytes(), "AES");
        byte[] encodedKey = key.getEncoded();

        System.out.println("Encoded Key: " + new String(encodedKey));
    }
}
