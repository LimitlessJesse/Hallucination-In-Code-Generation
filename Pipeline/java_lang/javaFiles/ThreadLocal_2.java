import java.lang.ThreadLocal;

public class ThreadLocal_2 {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("Hello, World!");
        System.out.println(threadLocal.get());
    }
}
