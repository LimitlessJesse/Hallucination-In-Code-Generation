import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class MaskFormatter_3 {
    public static void main(String[] args) {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("##.##");
            maskFormatter.setValueContainsLiteralCharacters(false);
            Number number = (Number) maskFormatter.stringToValue("12.34");
            System.out.println(number.doubleValue());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
