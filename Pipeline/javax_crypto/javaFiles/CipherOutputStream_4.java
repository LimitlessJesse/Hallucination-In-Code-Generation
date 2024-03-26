import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import java.io.OutputStream;
import java.security.Key;

public class CipherOutputStream_4 {
    public static void main(String[] args) throws Exception {
        Key key =...; // your key
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        OutputStream out =...; // your output stream
        CipherOutputStream cos = new CipherOutputStream(out, cipher);

        byte[] data = "Hello, World!".getBytes();
        cos.write(data, 0, data.length);
        cos.flush();
    }
}
