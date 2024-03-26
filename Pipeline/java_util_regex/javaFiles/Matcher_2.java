import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_2 {
    public static void main(String[] args) {
        String text = "Hello, world! This is a test.";
        String pattern = "test";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        int start = 10;
        boolean found = m.find(start);

        if(found){
            System.out.println("Pattern found starting at index " + m.start());
        } else {
            System.out.println("Pattern not found");
        }
    }
}
