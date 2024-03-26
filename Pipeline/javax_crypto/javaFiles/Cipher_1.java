import javax.crypto.Cipher;

public class Cipher_1 {
    public static void main(String[] args) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            int blockSize = cipher.getBlockSize();
            System.out.println("Block size: " + blockSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
