import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_4 {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 4, 5};
        String base64 = DatatypeConverter.printBase64Binary(bytes);
        System.out.println(base64);
    }
}
