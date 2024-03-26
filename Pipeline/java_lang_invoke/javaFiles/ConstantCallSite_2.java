import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ConstantCallSite_2 {
    public static void main(String[] args) throws Throwable {
        ArrayList<String> list = new ArrayList<>();
        Method method = ArrayList.class.getMethod("add", Object.class);
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle methodHandle = lookup.unreflect(method);
        ConstantCallSite callSite = ConstantCallSite.create(methodHandle);
        MethodHandle target = callSite.getTarget();
        target.invokeExact(list, "Hello");
        System.out.println(list);
    }
}
