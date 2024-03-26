import java.util.Optional;

public class Optional_4 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        String result = optional.orElseGet(() -> "Default value");
        System.out.println(result);  // Output: Default value
    }
}
