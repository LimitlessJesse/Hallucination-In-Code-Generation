import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_3 {
    public static void main(String[] args) {
        try {
            // Create a new HmacSHA256 key
            byte[] keyBytes = "mySecretKey".getBytes();
            SecretKeySpec key = new SecretKeySpec(keyBytes, "HmacSHA256");

            // Create a new Mac instance
            Mac mac = Mac.getInstance("HmacSHA256");

            // Initialize the Mac with the key
            mac.init(key);

            // Update the Mac with some data
            byte[] data = "Hello, World!".getBytes();
            mac.update(data);

            // Compute the Mac
            byte[] macBytes = mac.doFinal();

            // Print the Mac
            System.out.println("HMAC: " + new String(macBytes));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
