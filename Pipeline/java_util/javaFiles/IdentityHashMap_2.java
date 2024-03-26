import java.util.IdentityHashMap;

public class IdentityHashMap_2 {
    public static void main(String[] args) {
        IdentityHashMap<String, String> map = new IdentityHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        System.out.println(map.containsValue("value1"));  // Output: true
        System.out.println(map.containsValue("value3"));  // Output: false
    }
}
