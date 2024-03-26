import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Cipher_3 {
    public static void main(String[] args) throws Exception {
        // Generate a secret key
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();

        // Create a cipher instance
        Cipher cipher = Cipher.getInstance("AES");

        // Initialize the cipher for encryption
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // The text to encrypt
        String text = "Hello, World!";

        // Encrypt the text
        byte[] encrypted = cipher.doFinal(text.getBytes());

        // Print the encrypted text
        System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(encrypted));

        // Initialize the cipher for decryption
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        // Decrypt the text
        byte[] decrypted = cipher.doFinal(encrypted);

        // Print the decrypted text
        System.out.println("Decrypted: " + new String(decrypted));
    }
}
