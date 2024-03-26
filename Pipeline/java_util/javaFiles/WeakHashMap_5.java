import java.util.WeakHashMap;

public class WeakHashMap_5 {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<>();
        weakHashMap.put("One", 1);
        weakHashMap.put("Two", 2);
        weakHashMap.put("Three", 3);

        System.out.println("Size of weakHashMap: " + weakHashMap.size());
    }
}
