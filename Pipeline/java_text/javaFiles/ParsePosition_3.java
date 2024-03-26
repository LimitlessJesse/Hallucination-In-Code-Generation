import java.text.ParsePosition;

public class ParsePosition_3 {
    public static void main(String[] args) {
        ParsePosition pos = new ParsePosition(0);
        pos.setErrorIndex(5);
        System.out.println("Error index: " + pos.getErrorIndex());
    }
}
