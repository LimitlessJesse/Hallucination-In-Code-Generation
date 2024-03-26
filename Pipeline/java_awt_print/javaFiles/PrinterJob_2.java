import java.awt.print.PrinterJob;

public class PrinterJob_2 {
    public static void main(String[] args) {
        PrinterJob job = PrinterJob.getPrinterJob();
        boolean doPrint = job.printDialog();
        System.out.println("User chose to print: " + doPrint);
    }
}
