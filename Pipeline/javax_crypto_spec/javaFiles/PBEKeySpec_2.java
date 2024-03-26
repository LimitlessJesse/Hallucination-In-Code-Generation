import javax.crypto.spec.PBEKeySpec;
import java.security.spec.KeySpec;

public class PBEKeySpec_2 {
    public static void main(String[] args) {
        // Create a PBEKeySpec object
        KeySpec spec = new PBEKeySpec("password".toCharArray(), "salt".getBytes(), 65536, 256);

        // Get the salt value
        byte[] salt = ((PBEKeySpec) spec).getSalt();

        // Print the salt value
        System.out.println("Salt: " + new String(salt));
    }
}
