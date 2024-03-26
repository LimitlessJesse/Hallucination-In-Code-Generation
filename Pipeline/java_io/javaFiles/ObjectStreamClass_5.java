import java.io.ObjectStreamClass;

public class ObjectStreamClass_5 {
    public static void main(String[] args) {
        ObjectStreamClass osc = ObjectStreamClass.lookup(Main.class);
        ObjectStreamField[] fields = osc.getFields();

        for (ObjectStreamField field : fields) {
            System.out.println(field.getName());
        }
    }
}
