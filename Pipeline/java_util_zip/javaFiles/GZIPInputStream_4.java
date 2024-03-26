import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GZIPInputStream_4 {
    public static void main(String[] args) {
        try (GZIPInputStream gis = new GZIPInputStream(new FileInputStream("file.gz"))) {
            // Read from gis
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
