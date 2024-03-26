import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.Key;

public class CipherInputStream_3 {
    public static void main(String[] args) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        Key key = keyGenerator.generateKey();

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher);
        cipherOutputStream.write("Hello, World!".getBytes());
        cipherOutputStream.close();

        CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(outputStream.toByteArray()), cipher);
        byte[] buffer = new byte[1024];
        int read = cipherInputStream.read(buffer);
        if (read!= -1) {
            System.out.println(new String(buffer, 0, read));
        }
        cipherInputStream.close();
    }
}
