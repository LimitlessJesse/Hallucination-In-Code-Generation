import java.util.zip.Inflater;
import java.util.zip.DataFormatException;

public class Inflater_4 {
    public static void main(String[] args) {
        byte[] input = { /* your compressed data here */ };
        byte[] output = new byte[1024];

        Inflater inflater = new Inflater();
        inflater.setInput(input);

        try {
            int result = inflater.inflate(output);
            System.out.println("Inflated: " + result + " bytes");
        } catch (DataFormatException e) {
            e.printStackTrace();
        } finally {
            inflater.end();
        }
    }
}
