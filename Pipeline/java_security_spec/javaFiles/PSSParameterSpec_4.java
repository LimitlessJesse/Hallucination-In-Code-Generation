import java.security.spec.PSSParameterSpec;

public class PSSParameterSpec_4 {
    public static void main(String[] args) {
        PSSParameterSpec pssParameterSpec = new PSSParameterSpec("SHA-256", "MGF1", 32, 1);
        int saltLength = pssParameterSpec.getSaltLength();
        System.out.println("Salt Length: " + saltLength);
    }
}
