import javax.print.attribute.standard.PrinterName;

public class PrinterName_3 {
    public static void main(String[] args) {
        PrinterName printerName1 = new PrinterName("Printer1", null);
        PrinterName printerName2 = new PrinterName("Printer1", null);
        PrinterName printerName3 = new PrinterName("Printer2", null);

        System.out.println(printerName1.equals(printerName2)); // true
        System.out.println(printerName1.equals(printerName3)); // false
    }
}
