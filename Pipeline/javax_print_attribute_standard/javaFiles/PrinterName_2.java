import javax.print.attribute.standard.PrinterName;

public class PrinterName_2 {
    public static void main(String[] args) {
        PrinterName printerName = new PrinterName("My Printer", null);
        String name = printerName.getName();
        System.out.println("Printer Name: " + name);
    }
}
