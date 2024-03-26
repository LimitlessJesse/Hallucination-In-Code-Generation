import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

public class ECPrivateKeySpec_2 {
    public static void main(String[] args) throws Exception {
        // Generate a key pair
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        kpg.initialize(256);
        KeyPair kp = kpg.generateKeyPair();

        // Get the private key
        ECPrivateKeySpec privKeySpec = kp.getPrivate().getECPrivateKey().getPrivateKey();

        // Get the parameters of the elliptic curve
        ECParameterSpec params = privKeySpec.getParams();

        // Print the parameters
        System.out.println("Curve Name: " + params.getCurve().getCurveName());
        System.out.println("Field Size: " + params.getField().getFieldSize());
        System.out.println("Generator: " + params.getGenerator());
        System.out.println("Order: " + params.getOrder());
    }
}
