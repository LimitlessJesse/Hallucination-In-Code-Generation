import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_2 {
    public static void main(String[] args) {
        try {
            // Create a new Mac object with the HmacSHA256 algorithm
            Mac mac = Mac.getInstance("HmacSHA256");

            // Create a secret key
            byte[] secretKeyBytes = "mySecretKey".getBytes();
            SecretKeySpec secretKey = new SecretKeySpec(secretKeyBytes, "HmacSHA256");

            // Initialize the Mac object with the secret key
            mac.init(secretKey);

            System.out.println("Mac object initialized successfully!");
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
