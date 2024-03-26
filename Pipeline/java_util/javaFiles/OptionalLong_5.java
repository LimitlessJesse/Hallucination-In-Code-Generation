import java.util.OptionalLong;

public class OptionalLong_5 {
    public static void main(String[] args) {
        OptionalLong optionalLong = OptionalLong.of(10L);
        long result = optionalLong.orElse(20L);
        System.out.println(result); // Output: 10

        OptionalLong emptyOptionalLong = OptionalLong.empty();
        long result2 = emptyOptionalLong.orElse(20L);
        System.out.println(result2); // Output: 20
    }
}
