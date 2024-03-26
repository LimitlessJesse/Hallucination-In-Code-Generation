import java.util.WeakHashMap;

public class WeakHashMap_4 {
    public static void main(String[] args) {
        WeakHashMap<String, String> map = new WeakHashMap<>();
        map.put("key1", "value1");
        System.out.println(map.isEmpty()); // Output: false
        map.clear();
        System.out.println(map.isEmpty()); // Output: true
    }
}
