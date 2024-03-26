import java.util.Base64;

public class Base64_Encoder_2 {
    public static void main(String[] args) {
        String originalInput = "Hello, World!";
        byte[] originalInputBytes = originalInput.getBytes();

        Base64.Encoder encoder = Base64.getEncoder();
        String encodedString = encoder.encodeToString(originalInputBytes);

        System.out.println("Original Input: " + originalInput);
        System.out.println("Encoded String: " + encodedString);
    }
}
