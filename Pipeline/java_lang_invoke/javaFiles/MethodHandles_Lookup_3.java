import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandles_Lookup_3 {
    public static void main(String[] args) {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            MethodType type = MethodType.methodType(void.class, String.class);
            MethodHandles.StaticMethodHandle handle = lookup.findStatic(System.class, "out", type.insertArgument(0, String.class));
            handle.invokeExact("Hello, World!");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
