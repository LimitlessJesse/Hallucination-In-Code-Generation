import java.text.BreakIterator;
import java.util.Locale;

public class BreakIterator_1 {
    public static void main(String[] args) {
        String text = "Hello, world! This is a test.";
        BreakIterator iterator = BreakIterator.getWordInstance(Locale.US);
        iterator.setText(text);
        int start = iterator.first();
        for (int end = iterator.next(); end!= BreakIterator.DONE; start = end, end = iterator.next()) {
            System.out.println(text.substring(start, end));
        }
    }
}
