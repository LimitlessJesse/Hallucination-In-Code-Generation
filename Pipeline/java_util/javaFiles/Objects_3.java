import java.util.Objects;

public class Objects_3 {
    public static void main(String[] args) {
        Object obj = null;
        System.out.println(Objects.isNull(obj)); // Output: true

        obj = "Hello";
        System.out.println(Objects.isNull(obj)); // Output: false
    }
}
