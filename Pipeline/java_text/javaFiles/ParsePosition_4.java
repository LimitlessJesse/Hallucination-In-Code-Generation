import java.text.ParsePosition;

public class ParsePosition_4 {
    public static void main(String[] args) {
        ParsePosition pos = new ParsePosition(0);
        pos.setIndex(5);
        System.out.println("New index: " + pos.getIndex());
    }
}
