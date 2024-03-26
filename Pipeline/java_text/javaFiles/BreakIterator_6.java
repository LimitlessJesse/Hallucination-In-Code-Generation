import java.text.BreakIterator;
import java.util.Locale;

public class BreakIterator_6 {
    public static void main(String[] args) {
        String text = "Hello, world! This is a test.";
        BreakIterator boundary = BreakIterator.getWordInstance(Locale.US);
        boundary.setText(text);

        int start = boundary.first();
        for (int end = boundary.next(); end!= BreakIterator.DONE; start = end, end = boundary.next()) {
            System.out.println(text.substring(start, end));
        }
    }
}
