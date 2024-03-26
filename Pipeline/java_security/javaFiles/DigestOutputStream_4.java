import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.DigestOutputStream;
import java.io.IOException;

public class DigestOutputStream_4 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            DigestOutputStream dos = new DigestOutputStream(System.out, md);
            dos.write("Hello, World!".getBytes(), 0, "Hello, World!".length());
            byte[] digest = md.digest();
            System.out.println("\nDigest: " + new String(digest));
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
    }
}
