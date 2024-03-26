import java.util.EnumMap;

public class EnumMap_5 {
    public static void main(String[] args) {
        EnumMap<MyEnum, String> map = new EnumMap<>(MyEnum.class);
        map.put(MyEnum.ONE, "One");
        map.put(MyEnum.TWO, "Two");
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }
}

enum MyEnum {
    ONE, TWO
}
