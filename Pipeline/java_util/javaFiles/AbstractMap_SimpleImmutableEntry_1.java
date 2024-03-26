import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_1 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, Integer> entry1 = new AbstractMap.SimpleImmutableEntry<>("Hello", 1);
        AbstractMap.SimpleImmutableEntry<String, Integer> entry2 = new AbstractMap.SimpleImmutableEntry<>("Hello", 1);
        AbstractMap.SimpleImmutableEntry<String, Integer> entry3 = new AbstractMap.SimpleImmutableEntry<>("World", 2);

        System.out.println(entry1.equals(entry2)); // true
        System.out.println(entry1.equals(entry3)); // false
    }
}
