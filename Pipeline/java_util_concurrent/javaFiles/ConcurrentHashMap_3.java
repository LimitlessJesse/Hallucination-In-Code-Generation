import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_3 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println(map.get("Two"));  // Output: 2
    }
}
