import java.text.StringCharacterIterator;

public class StringCharacterIterator_17 {
    public static void main(String[] args) {
        String str = "Hello World!";
        StringCharacterIterator iterator = new StringCharacterIterator(str);
        char currentChar = iterator.current();
        System.out.println("Current character: " + currentChar);
    }
}
