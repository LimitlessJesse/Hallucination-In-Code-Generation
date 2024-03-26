import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_3 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, Integer> entry = new AbstractMap.SimpleImmutableEntry<>("Key", 10);
        System.out.println(entry.getKey());
    }
}
