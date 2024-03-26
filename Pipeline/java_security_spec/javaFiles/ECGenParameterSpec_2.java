import java.security.spec.ECGenParameterSpec;

public class ECGenParameterSpec_2 {
    public static void main(String[] args) {
        try {
            ECGenParameterSpec spec = new ECGenParameterSpec("secp256r1");
            String name = spec.getName();
            System.out.println("Name of the elliptic curve group: " + name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
