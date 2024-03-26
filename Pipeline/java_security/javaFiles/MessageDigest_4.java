import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_4 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            String algorithm = md.getAlgorithm();
            System.out.println("Algorithm: " + algorithm);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
