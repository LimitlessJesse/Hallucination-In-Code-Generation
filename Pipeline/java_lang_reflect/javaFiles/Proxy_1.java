import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class Proxy_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Calling method: " + method.getName());
                return method.invoke(list, args);
            }
        };

        List<String> proxyList = (List<String>) Proxy.newProxyInstance(
                list.getClass().getClassLoader(),
                list.getClass().getInterfaces(),
                handler
        );

        proxyList.add("Hello");
        System.out.println(proxyList);
    }
}
