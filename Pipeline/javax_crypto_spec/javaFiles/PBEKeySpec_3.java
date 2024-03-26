import javax.crypto.spec.PBEKeySpec;

public class PBEKeySpec_3 {
    public static void main(String[] args) {
        PBEKeySpec pbeKeySpec = new PBEKeySpec("password".toCharArray());
        int iterationCount = pbeKeySpec.getIterationCount();
        System.out.println("Iteration count: " + iterationCount);
    }
}
