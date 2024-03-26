import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

public class CipherOutputStream_3 {
    public static void main(String[] args) throws IOException, GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("AES");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher);

        String text = "Hello, World!";
        byte[] bytes = text.getBytes();

        cipherOutputStream.write(bytes);
        cipherOutputStream.flush();

        byte[] encryptedBytes = outputStream.toByteArray();
        System.out.println(new String(encryptedBytes));
    }
}
