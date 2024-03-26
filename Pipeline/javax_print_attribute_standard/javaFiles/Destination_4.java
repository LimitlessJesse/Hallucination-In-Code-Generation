import javax.print.attribute.standard.Destination;

public class Destination_4 {
    public static void main(String[] args) {
        Destination destination = new Destination("Printer1", "print://localhost/Printer1", "RAW");
        System.out.println(destination.getName());
    }
}
