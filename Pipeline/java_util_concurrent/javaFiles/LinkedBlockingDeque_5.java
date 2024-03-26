import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_5 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        deque.add("World");
        System.out.println(deque);
        deque.remove("Hello");
        System.out.println(deque);
    }
}
