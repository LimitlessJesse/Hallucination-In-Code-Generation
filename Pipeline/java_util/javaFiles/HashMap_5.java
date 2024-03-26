import java.util.HashMap;

public class HashMap_5 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        int size = map.size();
        System.out.println("Size of the HashMap: " + size);
    }
}
