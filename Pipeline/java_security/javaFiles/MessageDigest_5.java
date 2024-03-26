import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_5 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            int digestLength = md.getDigestLength();
            System.out.println("Digest length: " + digestLength);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
