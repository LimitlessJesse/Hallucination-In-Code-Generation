import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class HexBinaryAdapter_2 {
    public static void main(String[] args) {
        HexBinaryAdapter hexBinaryAdapter = new HexBinaryAdapter();
        byte[] bytes = hexBinaryAdapter.unmarshal("48656C6C6F"); // "Hello" in hex
        System.out.println(new String(bytes));
    }
}
