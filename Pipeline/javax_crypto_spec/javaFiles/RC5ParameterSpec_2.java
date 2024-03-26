import javax.crypto.spec.RC5ParameterSpec;

public class RC5ParameterSpec_2 {
    public static void main(String[] args) {
        RC5ParameterSpec spec = new RC5ParameterSpec(128, 10);
        int rounds = spec.getRounds();
        System.out.println("Rounds: " + rounds);
    }
}
