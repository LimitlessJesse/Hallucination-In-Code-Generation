import java.util.AbstractMap;
import java.util.HashMap;

public class AbstractMap_2 {
    public static void main(String[] args) {
        AbstractMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println(map.containsKey("One"));  // Output: true
        System.out.println(map.containsKey("Four")); // Output: false
    }
}
