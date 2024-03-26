import javax.print.attribute.standard.PrinterInfo;

public class PrinterInfo_2 {
    public static void main(String[] args) {
        PrinterInfo printerInfo = new PrinterInfo("PrinterName", null, null);
        String printerName = printerInfo.getName();
        System.out.println("Printer Name: " + printerName);
    }
}
