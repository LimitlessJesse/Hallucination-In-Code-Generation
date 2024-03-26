import java.text.BreakIterator;
import java.util.Locale;

public class BreakIterator_2 {
    public static void main(String[] args) {
        String text = "Hello, world!";
        BreakIterator iterator = BreakIterator.getWordInstance(Locale.US);
        iterator.setText(text);
        int last = iterator.last();
        if (last!= BreakIterator.DONE) {
            System.out.println("Last boundary offset: " + last);
        }
    }
}
