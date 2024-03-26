import java.util.AbstractMap;

public class AbstractMap_SimpleEntry_6 {
    public static void main(String[] args) {
        AbstractMap.SimpleEntry<String, String> entry = new AbstractMap.SimpleEntry<>("key", "value");
        int hashCode = entry.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
