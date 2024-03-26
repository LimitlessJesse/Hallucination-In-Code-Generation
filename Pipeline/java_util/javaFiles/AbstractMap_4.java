import java.util.AbstractMap;

public class AbstractMap_4 {
    public static void main(String[] args) {
        AbstractMap<String, Integer> map = new AbstractMap<>() {
            @Override
            public Integer get(Object key) {
                return super.get(key);
            }
        };

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println(map.get("One")); // Output: 1
        System.out.println(map.get("Two")); // Output: 2
        System.out.println(map.get("Three")); // Output: 3
    }
}
