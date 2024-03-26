import java.nio.charset.CoderResult;

public class CoderResult_3 {
    public static void main(String[] args) {
        CoderResult coderResult = CoderResult.OVERFLOW;
        boolean isUnmappable = coderResult.isUnmappable();
        System.out.println("Is unmappable: " + isUnmappable);
    }
}
