import java.util.ArrayDeque;

public class ArrayDeque_13 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");

        System.out.println(deque.contains("Hello"));  // Outputs: true
        System.out.println(deque.contains("Java"));  // Outputs: false
    }
}
