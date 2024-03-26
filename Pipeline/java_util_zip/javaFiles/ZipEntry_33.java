import java.util.zip.ZipEntry;

public class ZipEntry_33 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("file.txt");
        entry.setCrc(0x12345678);
        System.out.println("CRC: " + entry.getCrc());
    }
}
