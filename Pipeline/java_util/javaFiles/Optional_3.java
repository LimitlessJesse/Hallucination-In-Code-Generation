import java.util.Optional;

public class Optional_3 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        String result = optional.orElse("Default Value");
        System.out.println(result);
    }
}
