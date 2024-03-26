import java.text.StringCharacterIterator;

public class StringCharacterIterator_2 {
    public static void main(String[] args) {
        String str = "Hello";
        StringCharacterIterator iterator = new StringCharacterIterator(str);
        char lastChar = iterator.last();
        System.out.println("The last character is: " + lastChar);
    }
}
