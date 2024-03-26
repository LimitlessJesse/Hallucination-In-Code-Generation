import java.util.AbstractMap;
import java.util.HashMap;

public class AbstractMap_3 {
    public static void main(String[] args) {
        AbstractMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        boolean containsValue = map.containsValue("value1");
        System.out.println(containsValue);  // Output: true
    }
}
