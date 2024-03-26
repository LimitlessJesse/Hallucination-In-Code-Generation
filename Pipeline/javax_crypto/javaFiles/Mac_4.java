import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_4 {
    public static void main(String[] args) {
        try {
            // Create a new HmacSHA256 key
            byte[] keyBytes = "mySecretKey".getBytes();
            SecretKeySpec key = new SecretKeySpec(keyBytes, "HmacSHA256");

            // Create a new Mac instance
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(key);

            // Create a message
            byte[] message = "Hello, World!".getBytes();

            // Compute the HMAC
            byte[] hmac = mac.doFinal(message);

            // Print the HMAC
            System.out.println(new String(hmac));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
