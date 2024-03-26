import java.text.StringCharacterIterator;

public class StringCharacterIterator_3 {
    public static void main(String[] args) {
        StringCharacterIterator iterator = new StringCharacterIterator("Hello World");
        System.out.println(iterator.setIndex(6)); // Output: 'W'
    }
}
