import java.util.Objects;

public class Objects_1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = null;
        String str4 = "World";

        System.out.println(Objects.equals(str1, str2)); // true
        System.out.println(Objects.equals(str1, str3)); // false
        System.out.println(Objects.equals(str1, str4)); // false
    }
}
