import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.TextSyntax;

public class TextSyntax_2 {
    public static void main(String[] args) {
        TextSyntax textSyntax = new TextSyntax("A4", MediaSizeName.ISO_A4);
        String value = textSyntax.getValue();
        System.out.println("Value: " + value);
    }
}
