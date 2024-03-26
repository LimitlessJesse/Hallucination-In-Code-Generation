import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Constructor_2 {
    public static void main(String[] args) {
        try {
            // Get the constructor
            Constructor<String> constructor = String.class.getConstructor(String.class);

            // Create a new instance
            String str = constructor.newInstance("Hello");

            // Print the new instance
            System.out.println(str);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
