import java.util.zip.Adler32;

public class Adler32_5 {
    public static void main(String[] args) {
        Adler32 adler32 = new Adler32();
        byte[] data = "Hello, World!".getBytes();
        adler32.update(data);
        System.out.println("Checksum: " + adler32.getValue());
        adler32.reset();
        System.out.println("After reset, checksum: " + adler32.getValue());
    }
}
