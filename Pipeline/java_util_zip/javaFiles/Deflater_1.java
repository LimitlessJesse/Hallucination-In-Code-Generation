import java.util.zip.Deflater;

public class Deflater_1 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        byte[] input = "Hello, World!".getBytes();
        deflater.setInput(input);
    }
}
