import javax.crypto.spec.DESedeKeySpec;
import java.security.Key;
import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class DESedeKeySpec_2 {
    public static void main(String[] args) {
        try {
            // Create a new DESede key spec
            DESedeKeySpec keySpec = new DESedeKeySpec(new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17 });

            // Create a new SecretKeyFactory
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");

            // Generate the secret key
            SecretKey secretKey = keyFactory.generateSecret(keySpec);

            // Get the key in byte array format
            byte[] key = secretKey.getEncoded();

            // Print the key
            for (byte b : key) {
                System.out.print(b + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
