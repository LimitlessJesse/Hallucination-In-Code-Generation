import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_1 {
    public static void main(String[] args) {
        String text = "Hello, world! This is a test.";
        String pattern = "test";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        boolean found = m.find();
        System.out.println("Found: " + found);
    }
}
