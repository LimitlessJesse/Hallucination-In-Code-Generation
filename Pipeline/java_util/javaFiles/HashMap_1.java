import java.util.HashMap;

public class HashMap_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println(map.containsKey("One")); // Output: true
        System.out.println(map.containsKey("Four")); // Output: false
    }
}
