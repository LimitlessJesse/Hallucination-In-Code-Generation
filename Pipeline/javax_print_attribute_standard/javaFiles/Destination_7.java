import javax.print.attribute.standard.Destination;

public class Destination_7 {
    public static void main(String[] args) {
        Destination dest1 = new Destination("Destination1", "1234567890", "1234567890");
        Destination dest2 = new Destination("Destination2", "0987654321", "0987654321");

        System.out.println(dest1.equals(dest2));
    }
}
