import java.util.zip.ZipEntry;

public class ZipEntry_34 {
    public static void main(String[] args) {
        ZipEntry entry = new ZipEntry("file.txt");
        entry.setCompressedSize(100);
        System.out.println("Compressed size: " + entry.getCompressedSize());
    }
}
