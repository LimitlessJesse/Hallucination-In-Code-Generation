import javax.print.attribute.standard.Copies;

public class Copies_3 {
    public static void main(String[] args) {
        Copies copies1 = new Copies(3);
        Copies copies2 = new Copies(3);
        Copies copies3 = new Copies(4);

        System.out.println(copies1.equals(copies2));  // true
        System.out.println(copies1.equals(copies3));  // false
    }
}
