import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_2 {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 4, 5};
        String hexString = DatatypeConverter.printHexBinary(bytes);
        System.out.println(hexString);
    }
}
