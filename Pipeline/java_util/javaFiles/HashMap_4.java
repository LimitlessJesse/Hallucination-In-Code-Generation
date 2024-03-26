import java.util.HashMap;

public class HashMap_4 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Before removal: " + map);

        Integer removedValue = map.remove("Two");

        System.out.println("Removed value: " + removedValue);
        System.out.println("After removal: " + map);
    }
}
