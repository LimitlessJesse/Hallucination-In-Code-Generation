import java.lang.reflect.Field;

public class Field_2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Create an instance of the class
        MyClass myClass = new MyClass();

        // Get the Field object
        Field field = myClass.getClass().getDeclaredField("myField");

        // Set the field accessible
        field.setAccessible(true);

        // Set the value of the field
        field.set(myClass, "New Value");

        // Print the value of the field
        System.out.println(field.get(myClass));
    }
}

class MyClass {
    private String myField;

    public String getMyField() {
        return myField;
    }

    public void setMyField(String myField) {
        this.myField = myField;
    }
}
