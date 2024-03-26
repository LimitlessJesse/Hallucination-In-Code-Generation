import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_4 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, Integer> entry = new AbstractMap.SimpleImmutableEntry<>("Hello", 123);
        System.out.println(entry.getValue());
    }
}
