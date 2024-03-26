import javax.crypto.spec.SecretKeySpec;

public class SecretKeySpec_3 {
    public static void main(String[] args) {
        SecretKeySpec secretKeySpec = new SecretKeySpec("myKey".getBytes(), "AES");
        String algorithm = secretKeySpec.getAlgorithm();
        System.out.println("Algorithm: " + algorithm);
    }
}
