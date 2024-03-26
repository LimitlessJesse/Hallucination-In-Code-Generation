import java.util.Base64;

public class Base64_Encoder_1 {
    public static void main(String[] args) {
        byte[] src = "Hello, World!".getBytes();
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encoded = encoder.encode(src);
        System.out.println(new String(encoded));
    }
}
