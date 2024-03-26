import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_2 {
    public static void main(String[] args) {
        try {
            // Create a MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Update the digest with the string
            md.update("Hello, World!".getBytes());

            // Generate the digest
            byte[] digest = md.digest();

            // Print the digest
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
