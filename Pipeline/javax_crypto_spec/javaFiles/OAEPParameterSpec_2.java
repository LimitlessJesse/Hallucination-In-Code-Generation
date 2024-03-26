import javax.crypto.spec.OAEPParameterSpec;

public class OAEPParameterSpec_2 {
    public static void main(String[] args) {
        OAEPParameterSpec oaepParameterSpec = new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 20);
        System.out.println(oaepParameterSpec.getMGFAlgorithm());
    }
}
