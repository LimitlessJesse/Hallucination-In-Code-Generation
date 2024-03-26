import java.util.Objects;

public class Objects_4 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(Objects.nonNull(str));  // Output: true

        str = null;
        System.out.println(Objects.nonNull(str));  // Output: false
    }
}
