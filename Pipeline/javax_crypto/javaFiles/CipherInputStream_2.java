import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class CipherInputStream_2 {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, IOException {
        // Create a key
        Key key = new javax.crypto.spec.SecretKeySpec(new byte[16], "AES");

        // Create a cipher
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        // Create a byte array input stream
        ByteArrayInputStream bais = new ByteArrayInputStream("Hello, World!".getBytes());

        // Create a cipher input stream
        CipherInputStream cis = new CipherInputStream(bais, cipher);

        // Create a byte array to hold the decrypted data
        byte[] decryptedData = new byte[1024];

        // Read data from the cipher input stream
        int bytesRead = cis.read(decryptedData, 0, 1024);

        // Print the decrypted data
        System.out.println(new String(decryptedData, 0, bytesRead));
    }
}
