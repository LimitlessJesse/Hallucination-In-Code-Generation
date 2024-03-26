import java.util.AbstractMap;

public class AbstractMap_SimpleEntry_5 {
    public static void main(String[] args) {
        AbstractMap.SimpleEntry<String, Integer> entry1 = new AbstractMap.SimpleEntry<>("Key1", 1);
        AbstractMap.SimpleEntry<String, Integer> entry2 = new AbstractMap.SimpleEntry<>("Key1", 1);
        AbstractMap.SimpleEntry<String, Integer> entry3 = new AbstractMap.SimpleEntry<>("Key2", 2);

        System.out.println(entry1.equals(entry2)); // true
        System.out.println(entry1.equals(entry3)); // false
    }
}
