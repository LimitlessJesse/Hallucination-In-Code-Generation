import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Constructor_3 {
    public static void main(String[] args) {
        try {
            // Get the constructor
            Constructor<?> constructor = Class.forName("java.lang.String").getConstructor(String.class);

            // Create a new instance
            String str = (String) constructor.newInstance("Hello");

            // Print the result
            System.out.println(str);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
