import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import java.io.OutputStream;
import java.security.Key;

public class CipherOutputStream_2 {
    public static void main(String[] args) throws Exception {
        Key key = new javax.crypto.spec.SecretKeySpec("1234567890123456".getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        OutputStream out = new CipherOutputStream(System.out, cipher);
        out.write("Hello, World!".getBytes());
        out.close();
    }
}
