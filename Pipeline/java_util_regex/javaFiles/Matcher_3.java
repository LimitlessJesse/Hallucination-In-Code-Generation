import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_3 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String regex = "World";
        String replacement = "Java";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, replacement);
        }
        matcher.appendTail(sb);

        System.out.println(sb.toString());
    }
}
