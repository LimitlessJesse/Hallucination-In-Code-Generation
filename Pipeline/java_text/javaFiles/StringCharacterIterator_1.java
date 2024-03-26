import java.text.StringCharacterIterator;

public class StringCharacterIterator_1 {
    public static void main(String[] args) {
        StringCharacterIterator iterator = new StringCharacterIterator("Hello");
        char firstChar = iterator.first();
        System.out.println("First character: " + firstChar);
    }
}
