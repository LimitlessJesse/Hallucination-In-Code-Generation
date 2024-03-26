import java.lang.ThreadLocal;

public class ThreadLocal_3 {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("Hello");
        System.out.println(threadLocal.get());
        threadLocal.remove();
        System.out.println(threadLocal.get());
    }
}
