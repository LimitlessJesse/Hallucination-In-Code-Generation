import java.util.Optional;

public class Optional_1 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        System.out.println(optional.isPresent()); // Output: true

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent()); // Output: false
    }
}
