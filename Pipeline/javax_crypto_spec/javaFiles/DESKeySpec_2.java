import javax.crypto.spec.DESKeySpec;
import java.security.Key;
import javax.crypto.SecretKeyFactory;
import java.security.spec.KeySpec;

public class DESKeySpec_2 {
    public static void main(String[] args) {
        try {
            byte[] keyBytes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
            DESKeySpec keySpec = new DESKeySpec(keyBytes);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            Key key = keyFactory.generateSecret(keySpec);
            byte[] actualKey = key.getEncoded();

            // Print the actual key
            for (byte b : actualKey) {
                System.out.print(b + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
