import javax.swing.JComponent;
import javax.swing.TransferHandler;
import java.awt.datatransfer.Transferable;

public class TransferHandler_4 {
    public static void main(String[] args) {
        // Create a TransferHandler instance
        TransferHandler transferHandler = new TransferHandler() {
            @Override
            public void exportDone(JComponent c, Transferable data, int action) {
                // This method is called when the export operation is done
                System.out.println("Export operation done!");
            }
        };

        // Use the TransferHandler
        transferHandler.exportDone(null, null, 0);
    }
}
