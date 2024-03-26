import java.util.LinkedHashMap;

public class LinkedHashMap_3 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Initial map: " + map);

        map.clear();
        System.out.println("After clear: " + map);
    }
}
