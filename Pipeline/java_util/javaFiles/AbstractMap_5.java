import java.util.AbstractMap;

public class AbstractMap_5 {
    public static void main(String[] args) {
        AbstractMap<String, Integer> map = new AbstractMap<>() {
            @Override
            public V put(K key, V value) {
                // Implementation of put method
                return null;
            }
        };

        map.put("key", 1);
    }
}
