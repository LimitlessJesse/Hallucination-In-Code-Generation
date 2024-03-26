import java.awt.print.PrinterJob;
import java.awt.print.PrintService;

public class PrinterJob_6 {
    public static void main(String[] args) {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        PrintService printService = printerJob.getPrintService();
        System.out.println(printService);
    }
}
