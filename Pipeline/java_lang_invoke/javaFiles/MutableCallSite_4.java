import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class MutableCallSite_4 {
    public static void main(String[] args) throws Throwable {
        ArrayList<String> list = new ArrayList<>();
        Method method = ArrayList.class.getMethod("add", Object.class);
        MethodHandle methodHandle = MethodHandles.lookup().unreflect(method);
        MutableCallSite callSite = new MutableCallSite(methodHandle);
        callSite.setTarget(methodHandle);
        callSite.dynamicInvoker().invokeExact(list, "Hello");
        System.out.println(list);
    }
}
