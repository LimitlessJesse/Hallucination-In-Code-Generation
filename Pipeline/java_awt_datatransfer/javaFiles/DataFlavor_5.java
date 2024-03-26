import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class DataFlavor_5 {
    public static void main(String[] args) {
        DataFlavor dataFlavor = DataFlavor.stringFlavor;
        try {
            String mimeType = dataFlavor.getMimeType();
            System.out.println("MIME Type: " + mimeType);
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        }
    }
}
