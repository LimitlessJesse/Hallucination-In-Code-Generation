import java.io.ByteArrayInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestInputStream_2 {
    public static void main(String[] args) {
        try {
            // Create a new MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Create a new ByteArrayInputStream
            ByteArrayInputStream bis = new ByteArrayInputStream("Hello, World!".getBytes());

            // Create a new DigestInputStream
            DigestInputStream dis = new DigestInputStream(bis, md);

            // Read data from the input stream
            int data;
            while ((data = dis.read())!= -1) {
                // Process the data
            }

            // Get the digest
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
