import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class HexBinaryAdapter_1 {
    public static void main(String[] args) {
        HexBinaryAdapter hexBinaryAdapter = new HexBinaryAdapter();
        byte[] bytes = {1, 2, 3, 4, 5};
        String hexString = hexBinaryAdapter.marshal(bytes);
        System.out.println(hexString);
    }
}
