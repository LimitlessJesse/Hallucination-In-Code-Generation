import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

public class ECParameterSpec_10 {
    public static void main(String[] args) {
        // Assume we have an ECParameterSpec object
        ECParameterSpec ecParameterSpec =...;

        // Get the generator point
        ECPoint generator = ecParameterSpec.getGenerator();

        // Print the generator point
        System.out.println("Generator point: " + generator);
    }
}
