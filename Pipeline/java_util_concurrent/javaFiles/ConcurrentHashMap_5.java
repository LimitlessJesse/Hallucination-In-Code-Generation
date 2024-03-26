import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_5 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        System.out.println("Before replace: " + map);

        // Replace value for key1 only if current value is "value1"
        boolean result = map.replace("key1", "value1", "newValue1");
        System.out.println("Replaced key1? " + result);
        System.out.println("After replace: " + map);

        // Try to replace value for key2 only if current value is "value3"
        // This will not replace anything because current value is not "value3"
        result = map.replace("key2", "value3", "newValue2");
        System.out.println("Replaced key2? " + result);
        System.out.println("After replace: " + map);
    }
}
