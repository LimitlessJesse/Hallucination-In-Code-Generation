import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class PrintJobAdapter_2 {
    public static void main(String[] args) {
        PrintJobAdapter adapter = new PrintJobAdapter() {
            @Override
            public void printDataTransferCompleted(PrintJobEvent pje) {
                System.out.println("Data transfer completed for print job: " + pje.getPrintJob());
            }
        };

        // You can use the adapter here, but it's not necessary for this example.
    }
}
