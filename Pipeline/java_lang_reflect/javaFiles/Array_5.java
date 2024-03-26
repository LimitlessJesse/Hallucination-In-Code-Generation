import java.lang.reflect.Array;

public class Array_5 {
    public static void main(String[] args) {
        boolean[] booleans = {true, false, true, false};
        System.out.println(Array.getBoolean(booleans, 2));  // Output: true
    }
}
