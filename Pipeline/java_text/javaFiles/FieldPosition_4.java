import java.text.FieldPosition;

public class FieldPosition_4 {
    public static void main(String[] args) {
        FieldPosition fp = new FieldPosition(0);
        fp.setEndIndex(10);
        System.out.println("End Index: " + fp.getEndIndex());
    }
}
