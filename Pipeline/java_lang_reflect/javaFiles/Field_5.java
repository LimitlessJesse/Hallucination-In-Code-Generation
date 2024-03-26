import java.lang.reflect.Field;

public class Field_5 {
    public static void main(String[] args) throws NoSuchFieldException {
        Field field = Main.class.getDeclaredField("main");
        Class<?> type = field.getType();
        System.out.println(type);
    }
}
