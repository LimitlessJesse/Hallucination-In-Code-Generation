import java.util.AbstractMap;
import java.util.Map;

public class AbstractMap_SimpleImmutableEntry_5 {
    public static void main(String[] args) {
        Map.Entry<String, Integer> entry = new AbstractMap.SimpleImmutableEntry<>("Hello", 1);
        System.out.println("Before: " + entry);
        entry.setValue(2);
        System.out.println("After: " + entry);
    }
}
