import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class MaskFormatter_2 {
    public static void main(String[] args) {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("##.##");
            maskFormatter.setValue(12.3456);
            String formattedValue = maskFormatter.valueToString(maskFormatter.getValue());
            System.out.println(formattedValue);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
