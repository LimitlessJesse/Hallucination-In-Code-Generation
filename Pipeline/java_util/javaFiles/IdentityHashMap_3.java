import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMap_3 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
