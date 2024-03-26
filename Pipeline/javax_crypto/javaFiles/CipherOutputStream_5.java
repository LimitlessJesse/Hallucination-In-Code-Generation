import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CipherOutputStream_5 {
    public static void main(String[] args) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            FileOutputStream fileOut = new FileOutputStream("output.txt");
            CipherOutputStream cipherOut = new CipherOutputStream(fileOut, cipher);

            // Write some data to the cipher output stream
            String data = "Hello, World!";
            cipherOut.write(data.getBytes());

            // Flush the cipher output stream
            cipherOut.flush();

            // Close the cipher output stream
            cipherOut.close();
        } catch (NoSuchAlgorithmException | InvalidKeyException | IOException e) {
            e.printStackTrace();
        }
    }
}
