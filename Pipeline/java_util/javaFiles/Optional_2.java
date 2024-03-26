import java.util.Optional;

public class Optional_2 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        System.out.println(optional.get());
    }
}
