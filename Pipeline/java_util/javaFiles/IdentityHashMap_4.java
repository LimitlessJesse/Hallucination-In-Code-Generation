import java.util.IdentityHashMap;

public class IdentityHashMap_4 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        String key = "Hello";
        map.put(key, 1);
        System.out.println(map.get(key)); // Output: 1
    }
}
