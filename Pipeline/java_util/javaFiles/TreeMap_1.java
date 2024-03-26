import java.util.TreeMap;

public class TreeMap_1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println(map.containsKey("One"));  // Output: true
        System.out.println(map.containsKey("Four")); // Output: false
    }
}
