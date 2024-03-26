import java.security.SecureRandom;

public class SecureRandom_4 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bytes = new byte[10];
        secureRandom.nextBytes(bytes);

        for (byte b : bytes) {
            System.out.print(b + " ");
        }
    }
}
