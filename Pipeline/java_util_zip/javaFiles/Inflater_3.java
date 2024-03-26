import java.util.zip.Inflater;
import java.util.zip.DataFormatException;

public class Inflater_3 {
    public static void main(String[] args) {
        byte[] input = new byte[] { /* your compressed data here */ };
        Inflater inflater = new Inflater();
        inflater.setInput(input);

        byte[] output = new byte[1024];
        try {
            int resultLength = inflater.inflate(output);
            System.out.println("Inflated data length: " + resultLength);
        } catch (DataFormatException e) {
            e.printStackTrace();
        } finally {
            inflater.end();
        }
    }
}
