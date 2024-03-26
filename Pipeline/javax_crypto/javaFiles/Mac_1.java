import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_1 {
    public static void main(String[] args) {
        try {
            // Create a new Mac instance
            Mac mac = Mac.getInstance("HmacSHA256");

            // Create a secret key
            SecretKeySpec secretKey = new SecretKeySpec("mySecretKey".getBytes(), "HmacSHA256");

            // Initialize the Mac with the secret key
            mac.init(secretKey);

            // Update the Mac with some data
            mac.update("Hello, World!".getBytes());

            // Compute the Mac
            byte[] macBytes = mac.doFinal();

            // Print the Mac
            System.out.println("Mac: " + new String(macBytes));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
