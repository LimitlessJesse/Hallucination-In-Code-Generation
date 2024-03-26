import java.util.zip.CRC32;

public class CRC32_1 {
    public static void main(String[] args) {
        CRC32 crc32 = new CRC32();
        crc32.update(100);
        System.out.println(crc32.getValue());
    }
}
