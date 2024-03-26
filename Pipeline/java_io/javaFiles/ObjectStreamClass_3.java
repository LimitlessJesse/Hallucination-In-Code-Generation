import java.io.ObjectStreamClass;

public class ObjectStreamClass_3 {
    public static void main(String[] args) {
        ObjectStreamClass osc = ObjectStreamClass.lookup(Main.class);
        System.out.println(osc.getName());
    }
}
