import java.util.ArrayDeque;

public class ArrayDeque_5 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");
        System.out.println(deque);
        deque.remove("Hello");
        System.out.println(deque);
    }
}
