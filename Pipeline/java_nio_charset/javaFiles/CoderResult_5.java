import java.nio.charset.CoderResult;

public class CoderResult_5 {
    public static void main(String[] args) {
        CoderResult coderResult = CoderResult.OVERFLOW;
        boolean isOverflow = coderResult.isOverflow();
        System.out.println("Is overflow: " + isOverflow);
    }
}
