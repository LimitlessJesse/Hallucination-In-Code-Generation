import java.text.ParsePosition;

public class ParsePosition_2 {
    public static void main(String[] args) {
        ParsePosition pos = new ParsePosition(0);
        String s = "Hello, World!";
        int errorIndex = pos.getErrorIndex();
        System.out.println("Error Index: " + errorIndex);
    }
}
