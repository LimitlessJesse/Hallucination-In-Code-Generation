import javax.crypto.spec.RC2ParameterSpec;

public class RC2ParameterSpec_4 {
    public static void main(String[] args) {
        RC2ParameterSpec spec1 = new RC2ParameterSpec(128, 123);
        RC2ParameterSpec spec2 = new RC2ParameterSpec(128, 123);
        RC2ParameterSpec spec3 = new RC2ParameterSpec(192, 456);

        System.out.println(spec1.equals(spec2));  // true
        System.out.println(spec1.equals(spec3));  // false
    }
}
