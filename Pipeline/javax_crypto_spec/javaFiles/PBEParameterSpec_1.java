import javax.crypto.spec.PBEParameterSpec;

public class PBEParameterSpec_1 {
    public static void main(String[] args) {
        PBEParameterSpec spec = new PBEParameterSpec(new byte[16], 10);
        int iterationCount = spec.getIterationCount();
        System.out.println("Iteration Count: " + iterationCount);
    }
}
