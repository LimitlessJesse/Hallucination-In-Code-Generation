import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_4 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Initial map: " + map);

        Integer removedValue = map.remove("Two");
        System.out.println("Removed value: " + removedValue);

        System.out.println("Updated map: " + map);
    }
}
