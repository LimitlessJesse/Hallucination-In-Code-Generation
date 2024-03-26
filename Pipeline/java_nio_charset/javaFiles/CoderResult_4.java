import java.nio.charset.CoderResult;

public class CoderResult_4 {
    public static void main(String[] args) {
        CoderResult coderResult = CoderResult.OVERFLOW;
        boolean isUnderflow = coderResult.isUnderflow();
        System.out.println("Is underflow: " + isUnderflow);
    }
}
