import java.util.WeakHashMap;

public class WeakHashMap_3 {
    public static void main(String[] args) {
        WeakHashMap<String, String> map = new WeakHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }
}
