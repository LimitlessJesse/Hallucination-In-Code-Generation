import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_5 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            int end = matcher.end();
            System.out.println("The index position after the last character matched is: " + end);
        }
    }
}
