import java.util.TreeMap;

public class TreeMap_5 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        int size = treeMap.size();
        System.out.println("Size of the TreeMap: " + size);
    }
}
