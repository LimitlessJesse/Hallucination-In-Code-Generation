import javax.crypto.spec.GCMParameterSpec;

public class GCMParameterSpec_2 {
    public static void main(String[] args) {
        byte[] iv = new byte[12]; // Initialize your IV
        GCMParameterSpec spec = new GCMParameterSpec(128, iv); // Create a GCMParameterSpec with your IV
        byte[] returnedIV = spec.getIV(); // Get the IV from the GCMParameterSpec

        // Print the returned IV
        for (byte b : returnedIV) {
            System.out.print(b + " ");
        }
    }
}
