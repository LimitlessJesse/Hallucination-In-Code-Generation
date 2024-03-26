import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_3 {
    public static void main(String[] args) {
        String hexString = "48656C6C6F"; // Hexadecimal representation of "Hello"
        byte[] bytes = DatatypeConverter.parseHexBinary(hexString);
        String result = new String(bytes);
        System.out.println(result);
    }
}
