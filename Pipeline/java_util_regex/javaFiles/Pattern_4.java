import java.util.regex.Pattern;

public class Pattern_4 {
    public static void main(String[] args) {
        String input = "Hello, World! This is a test.";
        String[] words = Pattern.compile(",?").split(input);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
