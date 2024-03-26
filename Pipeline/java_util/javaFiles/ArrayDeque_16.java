import java.util.ArrayDeque;

public class ArrayDeque_16 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");
        System.out.println(deque);
        deque.clear();
        System.out.println(deque);
    }
}
