import javax.crypto.spec.RC2ParameterSpec;

public class RC2ParameterSpec_5 {
    public static void main(String[] args) {
        RC2ParameterSpec spec = new RC2ParameterSpec(128, 123);
        int hashCode = spec.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
