import java.util.ArrayDeque;

public class ArrayDeque_8 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");
        System.out.println(deque);  // Output: [Hello, World]

        String lastElement = deque.pollLast();
        System.out.println(lastElement);  // Output: World
        System.out.println(deque);  // Output: [Hello]
    }
}
