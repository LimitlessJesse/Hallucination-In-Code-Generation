import java.lang.reflect.Field;

public class Field_3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Create an object
        MyClass myObject = new MyClass();
        myObject.myField = "Hello";

        // Get the Field object
        Field field = myObject.getClass().getDeclaredField("myField");

        // Make the field accessible if it is non-public
        field.setAccessible(true);

        // Get the value of the field
        Object value = field.get(myObject);

        System.out.println(value);
    }
}

class MyClass {
    public String myField;
}
