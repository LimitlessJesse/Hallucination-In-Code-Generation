import java.util.StringJoiner;

public class StringJoiner_4 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Hello");
        joiner.add("World");
        System.out.println(joiner.toString());
    }
}
