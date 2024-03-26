import java.util.zip.CRC32;

public class CRC32_2 {
    public static void main(String[] args) {
        CRC32 crc32 = new CRC32();
        byte[] bytes = "Hello, World!".getBytes();
        crc32.update(bytes, 0, bytes.length);
        long checksum = crc32.getValue();
        System.out.println("Checksum: " + checksum);
    }
}
