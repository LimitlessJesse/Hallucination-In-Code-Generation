import javax.management.openmbean.SimpleType;

public class SimpleType_7 {
    public static void main(String[] args) {
        Object value = "Hello";
        System.out.println(SimpleType.STRING.isValue(value));
    }
}
