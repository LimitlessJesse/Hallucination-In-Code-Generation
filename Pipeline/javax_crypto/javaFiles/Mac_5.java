import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Mac_5 {
    public static void main(String[] args) {
        try {
            // Create a new Mac object
            Mac mac = Mac.getInstance("HmacSHA256");

            // Create a secret key
            SecretKeySpec secretKey = new SecretKeySpec("secret".getBytes(), "HmacSHA256");

            // Initialize the Mac with the secret key
            mac.init(secretKey);

            // Update the Mac with some data
            mac.update("Hello".getBytes());

            // Get the MAC
            byte[] macBytes = mac.doFinal();

            // Print the MAC
            System.out.println("MAC: " + new String(macBytes));

            // Reset the Mac
            mac.reset();

            // Update the Mac with some other data
            mac.update("World".getBytes());

            // Get the MAC again
            macBytes = mac.doFinal();

            // Print the MAC again
            System.out.println("MAC: " + new String(macBytes));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
