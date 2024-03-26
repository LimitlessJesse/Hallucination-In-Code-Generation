import java.util.zip.Inflater;

public class Inflater_2 {
    public static void main(String[] args) {
        byte[] input = new byte[] { 0x01, 0x02, 0x03, 0x04 };
        Inflater inflater = new Inflater();
        inflater.setInput(input, 0, input.length);
    }
}
