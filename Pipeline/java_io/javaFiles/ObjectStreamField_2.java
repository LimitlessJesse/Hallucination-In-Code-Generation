import java.io.ObjectStreamField;

public class ObjectStreamField_2 {
    public static void main(String[] args) {
        ObjectStreamField[] fields = {
            new ObjectStreamField("name", String.class),
            new ObjectStreamField("age", int.class)
        };

        for (ObjectStreamField field : fields) {
            System.out.println(field.getName());
        }
    }
}
