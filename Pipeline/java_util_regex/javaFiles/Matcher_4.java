import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_4 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            StringBuffer sb = new StringBuffer();
            matcher.appendTail(sb);
            System.out.println(sb.toString());
        }
    }
}
