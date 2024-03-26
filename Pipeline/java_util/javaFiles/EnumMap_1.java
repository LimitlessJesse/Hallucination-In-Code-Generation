import java.util.EnumMap;

public class EnumMap_1 {
    public static void main(String[] args) {
        EnumMap<MyEnum, String> map = new EnumMap<>(MyEnum.class);
        map.put(MyEnum.ONE, "One");
        map.put(MyEnum.TWO, "Two");

        System.out.println(map.containsKey(MyEnum.ONE));  // Outputs: true
        System.out.println(map.containsKey(MyEnum.THREE));  // Outputs: false
    }
}

enum MyEnum {
    ONE, TWO, THREE
}
