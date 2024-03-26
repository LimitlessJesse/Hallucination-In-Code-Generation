import java.util.HashMap;

public class HashMap_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Get the value for the key "Two"
        Integer value = map.get("Two");
        System.out.println(value);  // Output: 2
    }
}
