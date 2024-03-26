import java.util.OptionalLong;

public class OptionalLong_1 {
    public static void main(String[] args) {
        long value = 100;
        OptionalLong optionalLong = OptionalLong.of(value);
        System.out.println(optionalLong.getAsLong());
    }
}
