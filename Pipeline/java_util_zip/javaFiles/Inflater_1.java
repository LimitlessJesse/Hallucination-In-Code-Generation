import java.util.zip.Inflater;
import java.util.zip.DataFormatException;

public class Inflater_1 {
    public static void main(String[] args) {
        byte[] input = { /* your input data here */ };
        Inflater inflater = new Inflater();
        try {
            inflater.setInput(input);
        } catch (DataFormatException e) {
            e.printStackTrace();
        }
    }
}
