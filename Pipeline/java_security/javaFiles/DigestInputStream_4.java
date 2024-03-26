import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.DigestInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class DigestInputStream_4 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] data = "Hello, World!".getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            DigestInputStream dis = new DigestInputStream(bis, md);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = dis.read(buffer, 0, buffer.length))!= -1) {
                // process the data
            }

            byte[] digest = md.digest();
            System.out.println(new String(digest));
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
    }
}
