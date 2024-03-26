import java.util.IdentityHashMap;

public class IdentityHashMap_1 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        String key = "Two";
        boolean containsKey = map.containsKey(key);

        System.out.println("Does the map contain the key '" + key + "'? " + containsKey);
    }
}
