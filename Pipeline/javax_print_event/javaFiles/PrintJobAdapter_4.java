import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class PrintJobAdapter_4 {
    public static void main(String[] args) {
        PrintJobAdapter adapter = new PrintJobAdapter() {
            @Override
            public void printJobCompleted(PrintJobEvent pje) {
                System.out.println("Print job completed!");
            }
        };
    }
}
