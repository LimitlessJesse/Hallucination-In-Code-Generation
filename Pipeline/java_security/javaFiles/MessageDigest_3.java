import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_3 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] data = "Hello, World!".getBytes();
            md.update(data);
            byte[] digest = md.digest();
            System.out.println(new String(digest));

            // Reset the digest context
            md.reset();

            // Now, we can use the same MessageDigest instance for another digest operation
            md.update(data);
            byte[] newDigest = md.digest();
            System.out.println(new String(newDigest));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
