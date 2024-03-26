import java.util.zip.Deflater;

public class Deflater_5 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        byte[] input = "Hello, World!".getBytes();
        deflater.setInput(input);
        deflater.finish();

        byte[] output = new byte[1024];
        int compressedDataLength = deflater.deflate(output);

        System.out.println("Compressed data length: " + compressedDataLength);
    }
}
