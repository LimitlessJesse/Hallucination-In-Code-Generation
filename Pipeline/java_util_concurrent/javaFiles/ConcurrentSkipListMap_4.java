import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_4 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println(map);
    }
}
