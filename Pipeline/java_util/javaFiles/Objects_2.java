import java.util.Objects;

public class Objects_2 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Hash code of str1: " + Objects.hashCode(str1));
        System.out.println("Hash code of str2: " + Objects.hashCode(str2));
    }
}
