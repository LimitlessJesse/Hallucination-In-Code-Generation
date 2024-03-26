import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class PropertyDescriptor_6 {
    public static void main(String[] args) throws Exception {
        // Create a PropertyDescriptor
        PropertyDescriptor pd = new PropertyDescriptor("name", Person.class);

        // Get the write method
        Method writeMethod = pd.getWriteMethod();

        // Create an instance of the class
        Person person = new Person();

        // Set the value of the property using the write method
        writeMethod.invoke(person, "John Doe");

        // Print the value of the property
        System.out.println(pd.getReadMethod().invoke(person));
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
