import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_2 {
    public static void main(String[] args) {
        // Create a pattern
        Pattern pattern = Pattern.compile("\\d+");

        // Create a matcher
        Matcher matcher = pattern.matcher("12345");

        // Use the matcher
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
