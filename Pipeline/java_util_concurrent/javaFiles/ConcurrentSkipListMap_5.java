import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_5 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Before removal: " + map);

        map.remove("Two");

        System.out.println("After removal: " + map);
    }
}
