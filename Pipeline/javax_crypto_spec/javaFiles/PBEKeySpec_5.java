import javax.crypto.spec.PBEKeySpec;
import java.security.spec.KeySpec;

public class PBEKeySpec_5 {
    public static void main(String[] args) {
        char[] password = "myPassword".toCharArray();
        KeySpec keySpec = new PBEKeySpec(password);
        char[] retrievedPassword = keySpec.getPassword();

        System.out.println(new String(retrievedPassword));
    }
}
