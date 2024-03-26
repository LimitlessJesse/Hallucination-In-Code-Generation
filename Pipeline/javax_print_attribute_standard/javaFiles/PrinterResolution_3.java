import javax.print.attribute.standard.PrinterResolution;

public class PrinterResolution_3 {
    public static void main(String[] args) {
        PrinterResolution resolution1 = new PrinterResolution(100, 200, PrinterResolution.DIN_UNITS);
        PrinterResolution resolution2 = new PrinterResolution(100, 200, PrinterResolution.DIN_UNITS);

        boolean isEqual = resolution1.equals(resolution2);

        System.out.println("Are resolution1 and resolution2 equal? " + isEqual);
    }
}
