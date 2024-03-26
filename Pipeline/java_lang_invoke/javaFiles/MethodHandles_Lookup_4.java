import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;

public class MethodHandles_Lookup_4 {
    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType type = MethodType.methodType(boolean.class, Object.class);
        MethodHandle handle = lookup.findVirtual(ArrayList.class, "add", type);
        ArrayList<String> list = new ArrayList<>();
        handle.invoke(list, "Hello");
        System.out.println(list);
    }
}
